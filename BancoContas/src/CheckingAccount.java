public class CheckingAccount extends Account{
    
    private double monthlyFee;

    CheckingAccount(int accId, String clientId){
        super(accId, clientId, "CC"); 
    }

    @Override
    public void updateMonthly(){

    }

}
