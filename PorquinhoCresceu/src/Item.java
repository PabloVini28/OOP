class Item {

    private String label;
    private double value;
    private int volume;

    public Item(String label, float value,int volume) {
        this.label = label;
        this.value = value;
        this.volume = volume;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getVolume() {
        return this.volume;
    }
    
    public double getValue(){
        return this.value;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void setValue(float value){
        this.value += value;
    }

    @Override
    public String toString() {
        return  this.label + ":"+ String.format("%.2f",getValue())+":"+ this.volume;
    }
}