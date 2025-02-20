import java.util.*;

class Estacionamento{
    
    private final ArrayList<Veiculo> veiculos;
    private int horaAtual;
    
    Estacionamento(){
        veiculos = new ArrayList<>();
        this.horaAtual = 0;
    }
    
    private int procurarVeiculo(String id){
        for(int i = 0 ; i < this.veiculos.size() ; i++){
            if(this.veiculos.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    public void estacionar(Veiculo veiculo){
        this.veiculos.add(veiculo);
        veiculo.setEntrada(this.horaAtual);
    }
    
    public void pagar(String id){
        if(procurarVeiculo(id) == -1) {
        } else{
            for(int i = 0 ; i < this.veiculos.size() ; i++){
                if(this.veiculos.get(i).getId().equals(id)){
                    this.veiculos.get(i).calcularValor(horaAtual);
                    return;
                }
            }
        }
    }
    
    public void sair(String id){
        if(procurarVeiculo(id) == -1) return;
        for(int i = 0 ; i < this.veiculos.size() ; i++){
            if(this.veiculos.get(i).getId().equals(id)){
                this.veiculos.remove(i);
                return;
            }
        }
    }
    
    public void passarTempo(String tempo){
        this.horaAtual += IO.strToInt(tempo);
    }
    
    @Override
    public String toString(){
        String out = "";
        for(int i = 0 ; i < this.veiculos.size() ; i++){
                out += this.veiculos.get(i);
        }
        out += "Hora atual: " + this.horaAtual;
        return out;
    }
    
}