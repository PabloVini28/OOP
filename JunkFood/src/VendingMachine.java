
import java.util.ArrayList;

public class VendingMachine {
    
    private ArrayList<Slot> slots = new ArrayList<>();
    private float profit;
    private float cash;
    private int capacity;

    public VendingMachine(int capacity) {
        this.capacity = capacity;
        for(int i = 0 ; i < capacity ; i++){
            this.slots.get(i).setName("empty");
            this.slots.get(i).setPrice(0);
            this.slots.get(i).setQuantity(0);
        }
    }

    public Slot getSlot(int index){
        return this.slots.get(index);
    }

    public void setSlot(int index, Slot slot){
        this.slots.set(index, slot);
    }

    public void clearSlot(int index){
        this.slots.remove(index);
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

    public void buyItem(int index){
        if(this.slots.get(index) == null){
            return;
        }
        if(getCash() < this.slots.get(index).getPrice()){
            return;
        }
        if(this.slots.get(index).getQuantity() == 0){
            return;
        }

        this.slots.get(index).setQuantity(this.slots.get(index).getQuantity() - 1);
        this.cash -= this.slots.get(index).getPrice();
    }

    @Override
    public String toString(){
        String out = String.format("saldo: %.2f\n", this.cash);
        for(int i = 0 ; i < this.capacity ; i++){
            out += "[ ";
            out += this.slots.get(i).getName();
            out += " : " + this.slots.get(i).getQuantity() + " U : ";
            out += this.slots.get(i).getPrice() + " RS]\n";
        }
        return out;
    }
    

}
