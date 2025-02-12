abstract public class Veiculo{

    private final String id;
    protected String tipo;
    protected int horaEntrada;

    Veiculo(String id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public void setEntrada(int horaEntrada){
        this.horaEntrada = horaEntrada;
    }

    public int getEntrada(){
        return this.horaEntrada;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getId(){
        int aux =  IO.strToInt(this.id);
        return aux;
    }

    public abstract void calcularValor(String horaSaida);

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
