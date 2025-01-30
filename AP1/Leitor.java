class Leitor {

    private String nome;
    private Livro livroEmprestado;
    private int quantidadedeEmprestimos;

    public Leitor(String nome) {
        this.nome = nome;
        this.livroEmprestado = null;
        this.quantidadedeEmprestimos = 0;
    }
    
    public boolean possuiLivroEmprestado(){
        if(this.livroEmprestado != null){
            return true;
        }
        else return false;
    }

    public void realizarEmprestimo(Livro livroEmprestado) {
        if(possuiLivroEmprestado() == true){
            return;
        }
        this.livroEmprestado = livroEmprestado;
        this.quantidadedeEmprestimos =+ 1;
        IO.println("Sucesso! Total de empréstimos realizados por " + this.nome + ": " + 
        this.quantidadedeEmprestimos);
    }

    public Livro realizarDevolucao() {
        Livro livroRetornado = this.livroEmprestado;
        this.livroEmprestado = null;
        return livroRetornado;
    }

    @Override
    public String toString() {
        String str = "[" + this.nome;
        if(possuiLivroEmprestado() == true){
            str += "+, " + this.quantidadedeEmprestimos + "]";
            return str;
        }
        else{
            str += "-, " + this.quantidadedeEmprestimos + "]";
            return str;
        }
        
    }
}