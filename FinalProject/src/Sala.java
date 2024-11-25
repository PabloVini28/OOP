import java.util.List;

public class Sala {
    int numero_sala;
    int numero_assentos;
    String modo_exibicao;
    List<Sessao> sessoes;

    public void setNumeroSala(int numero_sala){
        this.numero_sala = numero_sala;
    }

    public void setNumeroAssentos(int numero_assentos){
        this.numero_assentos = numero_assentos;
    }

    public void setModoExibicao(String modo_exibicao){
        this.modo_exibicao = modo_exibicao;
    }

    public void setSessoes(List<Sessao> sessoes){
        this.sessoes = sessoes;
    }

    public int getNumeroSala(){
        return this.numero_sala;
    }

    public int getNumeroAssento(){
        return this.numero_assentos;
    }

    public String getModoExibicao(){
        return this.modo_exibicao;
    }

    public List<Sessao> getSessoes(){
        return this.sessoes;
    }
}
