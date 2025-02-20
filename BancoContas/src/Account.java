public abstract class Account{

    protected double balance;
    protected int accId;
    protected String clientId;
    protected String typeId;

    Account(int accId, String clientId, String typeId){
        this.balance = 0;
        this.accId = accId;
        this.clientId = clientId;
        this.typeId = typeId;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        if(this.balance < value){
            IO.println("saldo insuficiente");
        }
        else{
            this.balance -= value;
        }
    }

    public void transfer(Account other, double value){
        if(this.balance < value){
            IO.println("saldo insuficiente");
        }
        else{
            other.balance += value;
            this.balance -= value;
        }
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

    abstract void updateMonthly();

}
