
import java.util.ArrayList;

public class VendingMachine {
    
    private ArrayList<Slot> slots = new ArrayList<>();
    private float profit;
    private float cash;
    private int capacity;

    public VendingMachine(int capacity) {
    this.capacity = capacity;
    this.profit = 0;
    this.cash = 0;
    
    for (int i = 0; i < capacity; i++) {
        Slot slot = new Slot("empty", 0, 0); 
        this.slots.add(slot); 
    }
}

    public Slot getSlot(int index){
        return this.slots.get(index);
    }

    public void setSlot(int index, Slot slot){
        if(index <0 || index >= this.capacity){
            IO.println("fail: indice nao existe");
            return;
        }
        this.slots.set(index, slot);
        return;
    }

    public void clearSlot(int index){
        this.slots.get(index).setName("empty");
        this.slots.get(index).setPrice(0);
        this.slots.get(index).setQuantity(0);
    }

    public void insertCash(float cash){
        this.cash += cash;
    }

    public float withdrawCash(){
        float cashAux = this.cash;
        this.cash = 0;
        String message = String.format("voce recebeu %.2f RS", cashAux);
        IO.println(message);
        return cashAux;
    }

    public float getCash(){
        return this.cash;
    }

    public float getProfit(){
        return this.profit;
    }

    public void buyItem(int index) {
        if (index < 0 || index >= this.capacity) {  
            IO.println("fail: indice nao existe");
            return;
    }
        
    if (this.slots.get(index) == null) {
            IO.println("fail: espiral sem produtos");
            return;
    }
    if (getCash() < this.slots.get(index).getPrice()) {
            IO.println("fail: saldo insuficiente");
            return;
    }
    
    if (this.slots.get(index).getQuantity() == 0) {
            IO.println("fail: espiral sem produtos");
            return;
    }

    IO.println("voce comprou um " + this.slots.get(index).getName());
    this.slots.get(index).setQuantity(this.slots.get(index).getQuantity() - 1);
    this.cash -= this.slots.get(index).getPrice();
    }

    @Override
    public String toString() {
    String out = String.format("saldo: %.2f\n", this.cash);

    for (int i = 0; i < this.capacity; i++) {
        Slot slot = this.slots.get(i);
        if(slot.getName().equals("empty")){
            out += String.format("%d [   ", i);
        }
        else out += String.format("%d [ ", i);
        out += slot.getName();
        out += String.format(" : %d U : %.2f RS]\n", slot.getQuantity(), slot.getPrice());
    }

    return out;
}
    

}
