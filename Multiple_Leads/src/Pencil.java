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
            IO.println("fail: calibre incompativel");
            return false;
        } 
        this.tip = grafite;
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
            IO.println("fail: nao existe grafite");
            return;
        }
        if(tip.getSize() == 10){
            IO.println("fail: tamanho insuficiente");
            return;
        }
        // if(tip.getHardness() == "2B"){
        //     if(tip.getSize() <= 11){
        //         IO.println("fail: folha incompleta");
        //         tip.setSize(10);
        //         return;
        //     }
        //     tip.setSize(tip.getSize() - 2);
        //     return;
        // }
        // if(tip.usagePerSheet() == 4){
        //     if(tip.getSize() <= 13){
        //         IO.println("fail: folha incompleta");
        //         tip.setSize(10);
        //         return;
        //     }
        //     tip.setSize(tip.getSize() - 4);
        //     return;
        // }
        // if(tip.usagePerSheet() == 6){
        //     if(tip.getSize() <= 15){
        //         IO.println("fail: folha incompleta");
        //         tip.setSize(10);
        //         return;
        //     }
        //     tip.setSize(tip.getSize() - 6);
        //     return;
        // }
        
        if(tip.getSize() - 10 <  tip.usagePerSheet() ){
            IO.println("fail: folha incompleta");
            tip.setSize(10);
            return;
        }

        tip.setSize(tip.getSize() - tip.usagePerSheet());
    }
    
    public boolean pull(){
        if(!hasLead()){
            return false;
        }
        if(barrel == null){
            return false;
        }
                return false;
    }
    
    public String toString() {
        String saida = "calibre: " + thickness + ", grafite: ";
        if (tip != null)
            saida += "[" + tip + "]";
        else
            saida += "null";
        return saida;
    }
}
