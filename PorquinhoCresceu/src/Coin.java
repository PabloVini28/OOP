import java.text.DecimalFormat;

enum Coin {
    C10("M10",0.10, 1, "C10"  ),
    C25("M25", 0.25, 2, "C25"  ),
    C50("M50",0.50, 3, "C50"  ),
    C100("M100",1.00, 4, "C100" );

    private String moeda;
    private double value;
    private int volume;
    private String label;
    
    private Coin( String moeda,double value, int volume, String label ) {
        this.moeda = moeda;
        this.value = value;
        this.volume = volume;
        this.label = label;
    }
    
    public double getValue() {
        return this.value;
    }
    public int getVolume() {
        return this.volume;
    }
    public String getLabel() {
        return this.label;
    }
    
    public String getMoeda(){
        return this.moeda;
    }
    
    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat("0.00");
        return this.moeda + ":" + d.format(this.value) + ":" + this.volume;
    }
}