abstract class Veiculo{
    
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
    
    public int getHoraEntrada(){
        return this.horaEntrada;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getId(){
        return this.id;
    }
    
    public abstract void calcularValor(int horaSaida);
    
    @Override
    public String toString(){
        
        String out = "";
        
        int auxTipo = 10 - this.tipo.length();
        for(int i = 0 ; i < auxTipo ; i++){
            out += "_";
        }
    
        out += this.tipo + " : ";
        
        int auxId = 10 - this.id.length();
        for(int i = 0 ; i < auxId ; i++){
            out += "_";
        }
        
        out += this.id + " : " ;
        out += this.horaEntrada + "\n";
        return out;
    }
    
}