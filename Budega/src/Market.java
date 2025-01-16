import java.util.ArrayList;
import java.util.LinkedList;

public class Market {
    private ArrayList<Person> counters;
    private LinkedList<Person> queue;

    private boolean validateIndex(int index){
        return index >= 0 && index < this.counters.size();
    }

    public Market(int counterCount){
        this.counters = new ArrayList<>();
        for (int i=0; i<counterCount; i++) {
            this.counters.add(null);
        }
        this.queue = new LinkedList<>();
    }

    public void arrive(Person person){
        this.queue.add(person);
    }

    public void call(int index){
        if (this.counters.get(index) != null) {
            IO.println("fail: caixa ocupado");
            return;
        }

        if (this.queue.isEmpty()) {
            IO.println("fail: sem clientes");
            return;
        }
        
        Person person = queue.removeFirst();
        this.counters.set(index,person);
    }

    public void finish(int index){
        if (!validateIndex(index)) {
            IO.println("fail: caixa inexistente");
            return;
        }

        if (this.counters.get(index) == null) {
            IO.println("fail: caixa vazio");
            return;
        }

        this.counters.set(index,null);
    }

    @Override
    public String toString() {
        String out = "Caixas: [";
        for (int i = 0; i < this.counters.size(); i++) {
            if (this.counters.get(i) == null) out += "-----";
            else out += this.counters.get(i);
            if (i < this.counters.size() - 1) {
                out += ", ";
            }
        }
        out += "]";
    
        String out2 = "Espera: [";
        if (this.queue.isEmpty()) {
            // Nenhum elemento na fila de espera
        } else {
            for (int i = 0; i < this.queue.size(); i++) {
                out2 += this.queue.get(i);
                if (i < this.queue.size() - 1) {
                    out2 += ", ";
                }
            }
        }
        out2 += "]";
    
        return out + "\n" + out2;
    }
}
