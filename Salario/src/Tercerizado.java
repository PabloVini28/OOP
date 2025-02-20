public class Tercerizado extends Funcionario{

    protected int horas;
    protected boolean isSalubre = false;

    Tercerizado(String nome,int horas, String isSalubre) {
        super(nome);
    }

    public int getHoras(){
        return this.horas;
    }

    public String getIsSalubre(){
        return this.isSalubre;
    }

    @Override
    public int getSalario(){
        return super.getSalario();
    }

    @Override
    public void addDiaria(){

    }

    
}
