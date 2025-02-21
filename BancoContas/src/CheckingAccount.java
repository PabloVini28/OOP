public class CheckingAccount extends Account{
    
    private final double monthlyFee;

    public CheckingAccount(String clientId){
        super(clientId, "CC");
        this.monthlyFee = 20; 
    }

    @Override
    public void updateMonthly(){
        this.balance -= monthlyFee;
    }

}
