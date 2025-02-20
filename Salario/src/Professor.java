public class Professor extends Funcionario{

    protected String classe;

    public Professor(String nome, String classe) {
        super(nome);
        this.classe = classe;
        
    }

    public String getClasse(){
        return this.classe;
    }

    @Override
    public int getSalario() {
        if(classe.equals("A")){
            
        }
    }

    @Override
    public void addDiaria() {
        
    }

    @Override
    public String toString(){
        return "";
    }
    
}
