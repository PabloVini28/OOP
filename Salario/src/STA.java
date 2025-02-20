public class STA extends Funcionario {
    protected int nivel;

    public STA(String nome, int nivel){
        super(nome);
        this.nivel = nivel;
    }

    public int getNivel(){
        return this.nivel;
    }

    @Override
    public int getSalario(){
        
    }

    @Override
    public void addDiaria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDiaria'");
    }

    @Override
    public String toString(){
        return "";
    }

    
}
