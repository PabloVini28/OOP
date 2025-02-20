public class SavingsAccount extends Account{
    protected double monthlyInterest;

    SavingsAccount(int accId, String clientId){
        super(accId,clientId,"CP");
    }

    @Override
    public void updateMonthly(){
        
    }
}
