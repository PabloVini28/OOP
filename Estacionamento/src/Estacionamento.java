import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Veiculo> veiculos;
    private String horaAtual;

    public Estacionamento() {
        veiculos = new ArrayList<>();
        for(int i = 0 ; i < veiculos.size() ; i++){
            veiculos.add(null);
        }
    }

    public int procurarVeiculo(String id){
        int aux = IO.strToInt(id);
        for(int i = 0 ; i < this.veiculos.size() ; i++){
            if(this.veiculos.get(i).getId() == aux){
                return 1;
            }
        }
        return -1;
    }

    public void pagar(String id){

    }


}
