class Livro {
    
    private String titulo;
    private int anoPublicacao; 

    public Livro(String titulo,int anoPublicacao) {
        setTitulo(titulo);
        setAnoPublicacao(anoPublicacao);
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        
        if(anoPublicacao < 1440){
            IO.println("Falha: ano de publicação inválido");
            this.anoPublicacao = 1440;
        }
        if(anoPublicacao > 2025){
            IO.println("Falha: ano de publicação inválido");
            this.anoPublicacao = 2025;
        }
        
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        String out = "[" + this.titulo + ", " + this.anoPublicacao + "]";
        return out;
    }
}