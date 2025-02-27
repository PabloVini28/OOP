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
        int salario = 3000 + (300 * getNivel());
        if(this.diarias == 1){
            salario += 100;
        }
        return salario;
    }

    @Override
    public void addDiaria() {
        if(this.diarias == 1){
            return;
        }
        this.diarias++;
    }

    @Override
    public String toString(){
        return "";
    }

    
}
