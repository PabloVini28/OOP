package exceptions;

public class PigIsFull extends Exception {
    public PigIsFull(){
        super("fail: the pig is full");
    }
}
