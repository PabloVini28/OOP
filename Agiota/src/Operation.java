public class Operation {

    private int id;
    private static int nextOpId = 0;
    private String name;
    private Label label;
    private int value;

    Operation( String name, Label label, int value){
        this.id = Operation.nextOpId;
        Operation.nextOpId++;
        this.name = name;
        this.label = label;
        this.value = value;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Label getLabel(){
        return this.label;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return "id:" + this.id + " " + this.label + ":" + this.name + " " + this.value;
    }
}
