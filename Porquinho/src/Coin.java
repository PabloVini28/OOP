public class Coin {
    
    private double value;
    private int volume;
    private String label;

    public Coin C10;
    public 

    private Coin(double value, int volume, String label){
        this.value = value;
        this.volume = volume;
        this.label = label;
    }

    public double getValue(){
        return this.value;
    }

    public int getVolume(){
        return this.volume;
    }

    public String getLabel(){
        return this.label;
    }

}
