public class Filme {
    String titulo_filme;
    String diretor;
    String categoria;
    int duracao_minutos;
    int faixa_etaria;

    public void setTituloFilme(String titulo){
        this.titulo_filme = titulo;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setDuracaoMinutos(int minutos){
        this.duracao_minutos = minutos;
    }

    public void setFaixaEtaria(int faixa){
        this.faixa_etaria = faixa;
    }

    public String getTituloFilme(){
        return this.titulo_filme;
    }

    public String getDiretor(){
        return this.diretor;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public int getDuracaoMinutos(){
        return this.duracao_minutos;
    }

    public int getFaixaEtaria(){
        return this.faixa_etaria;
    }
}
