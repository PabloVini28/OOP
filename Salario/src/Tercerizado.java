public class Tercerizado extends Funcionario{

    protected int horas;
    protected boolean isSalubre = false;

    public Tercerizado(String nome,int horas, String isSalubre) {
        super(nome);
        this.horas = horas;
    }

    public int getHoras(){
        return this.horas;
    }

    public boolean  getIsSalubre(){
        return this.isSalubre;
    }

    @Override
    public int getSalario(){
        int salario = 4 * getHoras();
        if(!isSalubre){
            salario += 500;
        }
        return salario;
    }

    @Override
    public void addDiaria(){
        this.diarias++;
    }

    
}
