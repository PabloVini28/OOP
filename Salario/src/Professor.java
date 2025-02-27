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
        int salarioProfessor = 0;
        if(classe.equals('A')){
            salarioProfessor += 3000;
        }
        else if(classe.equals('B')){
            salarioProfessor += 5000;
        }
        else if(classe.equals('C')){
            salarioProfessor += 7000;
        }
        else if(classe.equals('D')){
            salarioProfessor += 9000;
        }
        else if(classe.equals('E')){
            salarioProfessor += 11000;
        }

        if(this.diarias == 1){
            salarioProfessor += 100;
        }
        if(this.diarias == 2){
            salarioProfessor += 200;
        }

        return salarioProfessor;
    }

    @Override
    public void addDiaria() {
        if(this.diarias == 2){
            return;
        }
        this.diarias++;
    }

    @Override
    public String toString(){
        return "";
    }
    
}
