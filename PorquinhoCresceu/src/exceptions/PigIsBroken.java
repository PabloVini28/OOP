package exceptions;

public class PigIsBroken extends Exception{

    public PigIsBroken(){
        super("fail: the pig is broken");
    }
}
