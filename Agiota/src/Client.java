import java.util.List;

public class Client {
    
    private String name;
    private int limit;
    private List<Operation> operations;

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

    public void addOperation(String name, Label label, int value){
        Operation operation = new Operation(name, label, value);
        this.operations.add(operation);
    }
}
