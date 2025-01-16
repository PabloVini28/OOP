
import java.util.ArrayList;

public class VendingMachine {
    
    private ArrayList<Slot> slots = new ArrayList<>();
    private float profit;
    private float cash;
    private int capacity;

    public VendingMachine(int capacity) {
        this.capacity = capacity;
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

    

    

}
