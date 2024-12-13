import java.util.ArrayList;

public class Pencil {
    private float thickness;
    private Lead tip;
    private ArrayList<Lead> barrel;

    public Pencil(float thickness) {
        this.thickness = thickness;
        this.tip = null;
        this.barrel = new ArrayList<>();
    }

    public float getThickness() {
        return this.thickness;
    }

    public void setThickness(float value) {
        this.thickness = value;
    }

    public boolean hasLead() {
        return this.tip != null;
    }

    public boolean insert(Lead grafite) {
        
        if(hasLead()){
            IO.println("fail: ja existe grafite");
            return false;
        }
        
        if(getThickness() < grafite.getThickness()){
            IO.println("fail: calibre incompatível");
            return false;
        } 
        this.barrel.add(grafite);
        return true;
    }

    public Lead remove() {
        if(this.tip ==null){
            return null;
        }
        Lead removido = this.tip;
        this.tip = null;
        return removido;
    }

    public void writePage() {
        if(this.tip==null){
            IO.println("fail: nao existe grafite no bico");
            return;
        }
        if(tip.getSize() == 10){
            IO.println("fail: tamanho insuficiente");
            return;
        }
        
        if(tip.getSize() - 10 <  tip.usagePerSheet() ){
            IO.println("fail: folha incompleta");
            tip.setSize(10);
            return;
        }

        tip.setSize(tip.getSize() - tip.usagePerSheet());
    }
    
    public boolean pull(){
        if(hasLead()){
            IO.println("fail: ja existe grafite no bico");
            return false;
        }
        if(this.barrel.isEmpty()){
            return false;
        }
        this.tip = this.barrel.remove(0);
        return true;
    }
    
    public String toString() {
        String saida = "calibre: " + this.thickness + ", bico: ";
        if (this.tip != null)
            saida += "[" + this.tip + "], ";
        else
            saida += "[], ";
        
        saida += "tambor: {";
        
        for(Lead lead : this.barrel){
            saida += "[" + lead + "]";
        }
        saida += "}";

        return saida;
    }
}
