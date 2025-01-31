public enum Coin {
    C10(0.10,1,"0.10"),
    C25(0.25,2,"0.25"),
    C50(0.50,3,"0.50"),
    C100(1,4,"100");

    private final double value;
    private  int volume;
    private final String label;

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

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public String toString(){
        String out = String.format("%.2f",getValue()) + ":" + getVolume();
        return out;
    }
}