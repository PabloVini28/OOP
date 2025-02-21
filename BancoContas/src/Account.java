abstract public class Account{

    protected double balance;
    protected int accId;
    protected String clientId;
    protected String typeId;
    private static int nextAccountId;

    public Account(String clientId, String typeId){
        this.balance = 0;
        this.accId = Account.nextAccountId;
        Account.nextAccountId++;
        this.clientId = clientId;
        this.typeId = typeId;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value) throws Exception{
        if(this.balance < value){
            throw new Exception("fail: saldo insuficiente");
        }
        this.balance -= value;
        
    }

    public void transfer(Account other, double value) throws Exception{
        if(this.balance < value){
            throw new Exception("fail: saldo insuficiente");
        }
        other.balance += value;
        this.balance -= value;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getId(){
        return this.accId;
    }

    public String getClientId(){
        return this.clientId;
    }

    public String getTypeStr(){
        return this.typeId;
    }

    abstract public void updateMonthly();
    
    @Override
    public String toString(){
        String out = getId() + ":" + getClientId() + ":" + String.format("%.2f",getBalance()) + ":" 
        + getTypeStr() + "\n";
        return out;
    }

}
