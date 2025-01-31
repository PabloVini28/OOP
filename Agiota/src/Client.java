import java.util.ArrayList;
import java.util.List;

public class Client {
    
    private String name;
    private int limit;
    private List<Operation> operations = new ArrayList<>();

    Client(String name, int limit){
        this.name = name;
        this.limit = limit;
    }

    public String getName(){
        return this.name;
    }

    public int getLimit(){
        return this.limit;
    }

    public List<Operation> getOperations(){
        return this.operations;
    }

    //public void addOperation(String name, Label label, int value){
      //  Operation operation = new Operation(name, label, value);
      //  this.operations.add(operation);
    //}

    public void addOperation(Operation operation) {
        this.operations.add( operation );
    }

    public int getBalance(){
        int devendo = 0;
        for(int i = 0 ; i < this.operations.size() ; i++){
            if(this.operations.get(i).getLabel() == Label.TAKE){ // cliente devolvendo dinheiro
                devendo -= this.operations.get(i).getValue();
            }
            else { //if(this.operations.get(i).getLabel() == Label.GIVE){ // cliente pegando dinheiro
                devendo += this.operations.get(i).getValue();
            }
        }
        return devendo;
    }

    @Override
    public String toString() {
        String ss = this.name + " " + this.getBalance() + "/" + this.limit + "\n";
        for ( Operation oper : this.operations ) {
            ss += oper + "\n";
        }
        return ss;
    }
}
