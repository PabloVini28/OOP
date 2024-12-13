import java.text.DecimalFormat;

public class Lead { //grafite

    private float thickness; //calibre
    private String hardness; //dureza
    private int size; //tamanho em mm

    public Lead(float thickness, String hardness, int size) {
        this.thickness = thickness;
        this.hardness = hardness;
        this.size = size;
    }

    public float getThickness() {
        return this.thickness;
    }

    public String getHardness() {
        return this.hardness;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int usagePerSheet() {
        if(getHardness().equals("HB")){
            return 1;
        }
        if(getHardness().equals("2B")){
            return 2;
        }
        if(getHardness().equals("4B")){
            return 4;
        }
        if(getHardness().equals("6B")){
            return 6;
        }
        return 0;
    }

    public String toString() {
        DecimalFormat form = new DecimalFormat("0.0");
        return form.format(thickness) + ":" + hardness + ":" + size;
    }
}

