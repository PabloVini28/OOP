import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pig {

    private boolean broken;
    private ArrayList<Coin> coins = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private int volumeMax;

    Pig(int volumeMax){
        this.volumeMax = volumeMax;
        this.broken = false;
    }

    public boolean addCoin(Coin coin){
        if(this.broken == true){
            IO.println("fail: porco quebrado");
            return false;
        }
        if(this.volumeMax - coin.getVolume() < 0){
            IO.println("fail: volume excedido");
            return false;
        }

        this.coins.add(coin);
        return true;

    }

    public boolean addItem(Item item){
        if(this.broken == true){
            IO.println("fail: porco quebrado");
            return false;
        }
        if(this.volumeMax - item.getVolume() < 0){
            IO.println("fail: volume excedido");
            return false;
        }

        this.items.add(item);
        return true;
    }

    public boolean breakPig(){
        if(this.broken == false){
            this.broken = true;
            return true;
        }
        else return false;
    }

    public ArrayList<Coin> extractCoins(){
        if(this.broken == false){
            return ArrayList<Coin> = null;
        }
        return this.coins;
    }

    public ArrayList<Item> extractItems(){
        if(this.broken == false){
            return ArrayList<Coin> = null;
        }
        return this.items;
    }

    


}
