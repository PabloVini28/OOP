public class Assento {
    int numero_assento;
    boolean ocupado;

    public void setNumeroAssento(int numero_assento){
        this.numero_assento = numero_assento;
    }

    public void setOcupado(boolean value){
        this.ocupado = value;
    }

    public int getNumeroAssento(){
        return this.numero_assento;
    }

    public boolean getOcupado(){
        return this.ocupado;
    }
}
