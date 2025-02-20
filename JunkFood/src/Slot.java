
public class Slot {

    private String name;
    private float price;
    private int quantity;

    Slot(String name, float price, int quantity){
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
    String out = "[ " + getName() + " " + getQuantity() + " U : " 
                 + String.format("%.2f", getPrice()) + " RS ]";
    return out;
    }

}
