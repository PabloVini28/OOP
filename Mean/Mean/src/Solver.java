class Mean{
    String nome;
    float nota01;
    float nota02;
    float nota03;
    
    public void ler(){
        this.nome = IO.input();
        this.nota01 = IO.inputFloat();
        this.nota02 = IO.inputFloat();
        this.nota03 = IO.inputFloat();
    }
    
    public float calculaMedia(){
        float soma = (this.nota01+this.nota02+this.nota03)/3;
        return soma;
    }
    
}

public class Solver {
    public static void main(String[] args) {
        Mean aluno = new Mean();
        aluno.ler();
        float total = aluno.calculaMedia();
        IO.printf("%.2f",total);
    }
}
