import java.text.DecimalFormat;
import java.util.*;

import exceptions.BreakPigFirst;
import exceptions.PigIsBroken;
import exceptions.PigIsFull;

class Pig {

    private boolean broken;
    private final List<Coin> coins;
    private final List<Item> items;
    private final int volumeMax;

    public Pig(int volumeMax) {
        this.broken = false;
        this.coins = new ArrayList<>();
        this.items = new ArrayList<>();
        this.volumeMax = volumeMax;
    }

    public Coin createCoin(String valor) {
        switch (valor) {
            case "10":
                return Coin.C10;
            case "25":
                return Coin.C25;
            case "50":
                return Coin.C50;
            case "100":
                return Coin.C100;
            default:
                return null;
        }
    }

    public boolean addCoin(Coin coin) throws Exception {
        if (this.broken) {
            throw new PigIsBroken();
        }

        if (coin.getVolume() > this.getVolumeRestante()) {
            throw new PigIsFull();
        }

        this.coins.add( coin );
        return true;
    }

    public boolean addItem(Item item) throws Exception {
    if (this.broken) {
        throw new PigIsBroken();
    }

    if (getVolume() + item.getVolume() > getVolumeMax()) {
        throw new PigIsFull();
    }

    this.items.add(item);
    return true;
}


    public boolean breakPig() throws Exception {
        if (this.broken) {
            throw new PigIsBroken();
        }
        
        this.broken = true;
        return true;
    }

    public ArrayList<String> extractCoins() throws Exception {
        if (!this.broken) {
            throw new BreakPigFirst();
        }

        ArrayList<String> labels = new ArrayList<>();

        for (Coin c : this.coins) {
            labels.add( c.toString() );
        }
        
        this.coins.clear();
        return labels;
    }

    public ArrayList<String> extractItems() throws Exception {
        if (!this.broken) {
            throw new BreakPigFirst();
        }

        ArrayList<String> labels = new ArrayList<>();

        for (Item i : this.items) {
            labels.add( i.toString() );
        }
        
        this.items.clear();
        return labels;
    }

    @Override
    public String toString() {
        
    DecimalFormat d = new DecimalFormat("0.00");
    String s = "[";

    for (int i = 0; i < this.coins.size(); i++) {
        if (this.coins.size() - 1 == i) {
            s += this.coins.get(i).toString();
        } else {
            s += this.coins.get(i).toString() + ", ";
        }
    }

    if (!this.items.isEmpty()) {
        s += ", ";
    }

    for (int i = 0; i < this.items.size(); i++) {
        if (this.items.size() - 1 == i) {
            s += this.items.get(i).toString();
        } else {
            s += this.items.get(i).toString() + ", ";
        }
    }

    s += "] : ";

    s += String.format("%.2f", getValue()) + "$ : " + getVolume() + "/" + getVolumeMax() + " : ";

    if (isBroken()) {
        s += "broken";
    } else {
        s += "intact";
    }

    return s;
    }


    public int getVolume() {
        if (this.isBroken()) {
            return 0;
        }
        
        int volume = 0;
        for (Coin c : this.coins) {
            volume += c.getVolume();
        }
        for (Item i : this.items) {
            volume += i.getVolume();
        }
        return volume;
    }

    public double getValue() {
        double value = 0;
        for (Coin c : this.coins) {
            value += c.getValue();
        }
        for(Item i: this.items){
            value += i.getValue();
        }
        return value;
    }

    public int getVolumeMax() {
        return this.volumeMax;
    }

    public int getVolumeRestante() {
        return this.getVolumeMax() - this.getVolume();
    }

    public boolean isBroken() {
        return this.broken;
    }
}