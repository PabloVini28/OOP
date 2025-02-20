
import java.util.Map;
import java.util.TreeMap;

public class UFC {
    private Map<String, Funcionario> funcionarios = new TreeMap<>();

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.put(funcionario.nome, funcionario);
    }

    public Funcionario getFuncionario(String nome){
        return this.funcionarios.get(nome);
    }

    public void rmFuncionario(String nome){
        this.funcionarios.remove(nome);
    }

    public void setBonus(int bonus){
        
    }
}
