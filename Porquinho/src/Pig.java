import java.util.ArrayList;

public class Pig {

    private boolean broken;
    private final ArrayList<Coin> coins = new ArrayList<>();
    private final ArrayList<Item> items = new ArrayList<>();
    private final int volumeMax;

    Pig(int volumeMax){
        this.volumeMax = volumeMax;
        this.broken = false;
    }

    public boolean addCoin(Coin coin){
        if(this.broken == true){
            IO.println("fail: porco quebrado");
            return false;
        }
        if((getVolume() + coin.getVolume()) > this.volumeMax){
            IO.println("fail: volume excedido");
            return false;
        }

        this.coins.add(coin);
        return true;

    }

    public boolean addItem(Item item){
        if(this.broken == true){
            IO.println("fail: the pig is broken");
            return false;
        }
        if(getVolume() + item.getVolume() > this.volumeMax){
            IO.println("fail: the pig is full");
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
        if(!this.broken){
            IO.println("fail: you must break the pig first");
            IO.println("[]");
            return new ArrayList<>();
        }
        this.coins.clear();
        return this.coins;
    }

    public ArrayList<Item> extractItems(){
        if(!this.broken){
            IO.println("fail: you must break the pig first");
            IO.println("[]");
            return new ArrayList<>();
        }
        String out = "[";
        for(int i = 0 ; i < this.items.size() ; i++){
            out += this.items.get(i).toString();
            if(this.items.size() - 1 != i){
                out += ", ";
            }
        }
        out += "]";
        this.items.clear();
        return this.items;
    }

    public int getVolume(){
        int volume = 0;
        if(isBroken()){
            return volume;
        }
        for(int i = 0 ; i < this.coins.size() ; i++){
            if(this.coins.get(i) != null){
                volume += this.coins.get(i).getVolume();
            }
        }
        for(int i = 0 ; i < this.items.size() ; i++){
            if(this.items.get(i) != null){
                volume += this.items.get(i).getVolume();
            }
        }
        return volume;
    }

    public double getValue(){
        double value = 0;
        for(int i = 0 ; i < this.coins.size() ; i++){
            if(this.coins.get(i) != null){
                value += this.coins.get(i).getValue();
            }
        }
        return value;
    }

    public int getVolumeMax(){
        return this.volumeMax;
    }

    public boolean isBroken(){
        if(this.broken == true){
            return true;
        }
        else return false;
    }

    @Override
    public String toString(){
        String out = "state=";
        if(!isBroken()){
            out += "intact : ";
        }
        else {
            out += "broken : ";
        }
        out += "coins=[";
        for(int i = 0 ; i < this.coins.size() ; i++){
            out += this.coins.get(i).toString();
            if(this.coins.size() - 1 != i){
                out += ", ";
            }
        }
        out += "] : items=[";
        for(int i = 0 ; i < this.items.size() ; i++){
            out += this.items.get(i).toString();
            if(this.items.size() - 1 != i){
                out += ", ";
            }
        }
        out += "] : value=" + String.format("%.2f",getValue())  + " : volume=" + getVolume()  
        + "/" + getVolumeMax() + "\n";
        return  out;

    }


}
