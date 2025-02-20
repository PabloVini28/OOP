import java.text.DecimalFormat;
import java.util.*;

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
        return switch (valor) {
            case "10" -> Coin.C10;
            case "25" -> Coin.C25;
            case "50" -> Coin.C50;
            case "100" -> Coin.C100;
            default -> null;
        };
    }

    public boolean addCoin(Coin coin) throws Exception {
        if (this.broken) {
            throw new Exception("fail: the pig is broken");
        }

        if (coin.getVolume() > this.getVolumeRestante()) {
            throw new Exception("fail: the pig is full");
        }

        this.coins.add( coin );
        return true;
    }

    public boolean addItem(Item item) throws Exception {
        if (this.broken) {
            throw new Exception("fail: the pig is broken");
        }

        if (item.getVolume() > this.getVolumeRestante()) {
            throw new Exception("fail: the pig is full");
        }

        this.items.add( item );
        return true;
    }

    public boolean breakPig() throws Exception {
        if (this.broken) {
            throw new Exception("fail: the pig is broken");
        }
        
        this.broken = true;
        return true;
    }

    public ArrayList<String> extractCoins() throws Exception {
        if (!this.broken) {
            throw new Exception("fail: you must break the pig first\n[]");
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
            throw new Exception("fail: you must break the pig first\n[]");
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
        // state=intact : coins=[] : items=[] : value=0.00 : volume=0/20
        DecimalFormat d = new DecimalFormat("0.00");
        String s = "state=";
        s += ((this.broken) ? "broken" : "intact") + " : ";
        s += "coins=" + this.coins + " : ";
        s += "items=" + this.items + " : ";
        s += "value=" + d.format(this.getValue()) + " : ";
        s += "volume=" + this.getVolume() + "/" + this.getVolumeMax();
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