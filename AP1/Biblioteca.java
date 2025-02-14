import java.util.ArrayList;
import java.util.LinkedList;

class Biblioteca {

    private final ArrayList<Livro> livros = new ArrayList<>();
    private final LinkedList<Leitor> leitores = new LinkedList<>();  // leitores como lista vazia

    public Biblioteca(int capacidade) {
        for(int i = 0 ; i < capacidade ; i++){
            this.livros.add(null);  // preenchendo com null
        }
    }

    public boolean adicionarLivro(Livro livro) {
    
        for(int i = 0 ; i < this.livros.size() ; i++){
            if(this.livros.get(i) == null){
                this.livros.set(i,livro);
                return true;
            }
        }
        IO.println("Falha: a biblioteca está cheia");
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
        
        for(int i = 0 ; i < this.leitores.size() ; i++){
            if(this.leitores.get(0).possuiLivroEmprestado()){
                IO.println("Falha: leitor só pode estar com um livro emprestado por vez");
                return false;
            }
        }
        
        boolean flag = false;
        for(int i = 0 ; i < this.livros.size() ; i++){
            if(this.livros.get(i) != null && i == indiceLivro){
                this.leitores.get(0).realizarEmprestimo(this.livros.get(indiceLivro));
                this.livros.set(indiceLivro,null);
                this.leitores.addLast(this.leitores.removeFirst());
                flag = true;
            }
            if(flag == true){
                IO.println("Sucesso! Total de empréstimos realizados por " + this.leitores.get(0).getNome() + 
                ": 1");
                return true;
            }
        }
        
        IO.println("Falha: livro indisponível");
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
            Livro livroDevolvido = this.leitores.get(0).realizarDevolucao();
            this.adicionarLivro( livroDevolvido );
            this.leitores.addLast(this.leitores.removeFirst());
            return true;
        }
    
        return false;
    }
    
    @Override
    public String toString() {
        String str = "Livros: { ";
        for(int i  = 0 ; i < this.livros.size() ; i++){
            if(this.livros.get(i) != null){
            str += "[" + this.livros.get(i).toString();
            }
            else{
                str += "[-----] ";
            }
        }
    
        str += """
            }
            Fila de Leitores: { """;
    
        for(int i = 0 ; i < this.leitores.size() ; i++){
            if(this.leitores.get(i) != null){
                str += "[" + this.leitores.get(i).toString(); 
            }
        }
        str += "}";
        return str;
    }
}