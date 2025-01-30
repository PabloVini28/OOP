
import java.io.IO;
import java.util.ArrayList;
import java.util.LinkedList;


class Biblioteca {
    
    private ArrayList<Livro> livros = new ArrayList<>();
    private LinkedList<Leitor> leitores = new LinkedList<>();

    public Biblioteca(int capacidade) {
        for(int i = 0 ; i < capacidade ; i++){
            this.livros.add(null);
        }

    }

    public boolean adicionarLivro(Livro livro) {
        for(int i = 0 ; i < this.livros.size() ; i++){
            if(this.livros.get(i) == null){
                this.livros.set(i, livro);
                return true;
            }
        }

        return false;
    }

    public void registrarLeitor(Leitor leitor) {
        this.leitores.addLast(leitor);
    }

    public boolean emprestarLivro(int indiceLivro) {

        if(this.leitores.isEmpty()){
            IO.println("Falha: fila de leitores vazia");
            return false;
        }

        if(this.leitores.get(0).possuiLivroEmprestado()){
                IO.println("Falha: leitor só pode estar com um livro emprestado por vez");
                return false;
        }

        for(int i = 0 ; i < this.livros.size() ; i++){
            if(this.livros.get(i) == null){
                IO.println("Falha: livro indisponível");
            }
        }

        for(int i = 0 ; i < this.leitores.size() ; i++){
            if(this.leitores.get(i).possuiLivroEmprestado() == false){
                this.leitores.get(i).realizarEmprestimo(this.livros.get(indiceLivro));
                this.livros.set(indiceLivro, null);
                this.leitores.addLast(this.leitores.removeFirst());
                return true;
            }
        }

        return false;
    }

    public boolean receberLivro() {
        if(this.leitores.isEmpty()){
            IO.println("Falha: fila de leitores vazia");
            return false;
        }
        
        if(this.leitores.get(0).possuiLivroEmprestado() == false){
            IO.println("Falha: leitor não possui um livro para devolver");
            return false;
        }

        if(this.livros.get(0) != null){
            Livro livrodevolvido = this.leitores.get(0).realizarDevolucao();
            this.livros.set(0,livrodevolvido);
            this.leitores.addLast(this.leitores.removeFirst());
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        String str = "Livros: { ";
        for(int i = 0 ; i < this.livros.size() ; i++){
            if(this.livros.get(i) != null){
                str += this.livros.get(i).toString() + " ";
            }
        }
        str += "}\nLeitores: { ";
        for(int i = 0 ; i < this.leitores.size() ; i++){
            str += this.leitores.get(i).toString() + " ";
        }
        str += "}";
    }
    // consertar o toString
    
}
