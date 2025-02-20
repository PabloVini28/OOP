abstract public class Funcionario {

    protected int bonus;
    protected int diarias;
    protected int maxDiarias;
    protected String nome;

    Funcionario(String nome){
        this.nome = nome;
    }

    abstract public void addDiaria();

    abstract public int getSalario();

    public String getNome(){
        return this.nome;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

}
