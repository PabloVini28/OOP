import java.util.ArrayList;
import java.util.LinkedList;

public class Market {
    private ArrayList<Person> counters;
    private LinkedList<Person> queue;

    private boolean validateIndex(int index){
        return index >= 0 && index < this.counters.size();
    }

    public Market(int CounterCount){
        this.counters = new ArrayList<>(CounterCount);
        this.queue = new LinkedList<>();
    }

    public void arrive(Person person){
        this.queue.add(person);
    }

    public void call(int index){
        if (validateIndex(index)){
            if (!this.queue.isEmpty()){
                Person person = queue.removeFirst();
                this.counters.add(person);
            }
        }
    }

    public void finish(int index){
        if (validateIndex(index)){
            this.counters.remove(index);
        }
    }

    public boolean cutInLine(Person sneaky, String gullible){
        int index = -1;
        for (int i = 0; i < this.queue.size(); i++){
            if (this.queue.get(i).getName().equals(gullible)){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }
        this.queue.add(index, sneaky);
        return true;
    }

    public boolean giveUp(String name){
        for (int i = 0; i < this.queue.size(); i++){
            if (this.queue.get(i).getName().equals(name)){
                this.queue.remove(i);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String out = "Caixas: [";
        if(this.counters.isEmpty()){
            for(int i = 0 ; i < this.counters.size(); i++){
                if(i == this.counters.size() - 1){
                    out += "]";
                }else{
                    out += "-----, ";
                }
            }
        
        }
        else{
            for(int i = 0 ; i < this.counters.size(); i++){
                if(i == this.counters.size() - 1){
                    out += this.counters.get(i) + "]";
                }else{
                    out += this.counters.get(i) + ", ";
                }
            }
        }

        String out2 = "Espera: [";
        if(this.queue.isEmpty()){
            for(int i = 0 ; i < this.queue.size(); i++){
                if(i == this.queue.size() - 1){
                    out2 += "]";
                }else{
                    out2 += "-----, ";
                }
            }
        }
        else{
            for(int i = 0 ; i < this.queue.size(); i++){
                if(i == this.queue.size() - 1){
                    out2 += this.queue.get(i) + "]";
                }else{
                    out2 += this.queue.get(i) + ", ";
                }
            }
        }

        return out + "\n" + out2;
    }
}
