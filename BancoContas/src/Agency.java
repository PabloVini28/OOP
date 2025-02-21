import java.util.LinkedHashMap;
import java.util.Map;

public class Agency {
    
    private final Map<Integer,Account> accounts;
    private final Map<String, Client> clients;

    private Account getAccount(int accountId)throws Exception{
        if(this.accounts.get(accountId) == null){
            throw new Exception("fail: conta nao encontrada");
        }
        return this.accounts.get(accountId);
    }

    Agency(){
        this.accounts = new LinkedHashMap<>();
        this.clients = new LinkedHashMap<>();
    }

    public void addClient(String clientId){
        Client newClient = new Client(clientId);
        this.clients.put(newClient.getClientId(), newClient); 
    
        CheckingAccount checkingAccount = new CheckingAccount(clientId);
        SavingsAccount savingsAccount = new SavingsAccount(clientId);
    
        newClient.addAccount(checkingAccount);
        newClient.addAccount(savingsAccount);
    
        this.accounts.put(checkingAccount.getId(), checkingAccount);
        this.accounts.put(savingsAccount.getId(), savingsAccount);
    }
    

    public void deposit(int accId, double value) throws Exception{
        Account account = getAccount(accId);
        account.deposit(value);
    }

    public void withdraw(int accId, double value) throws Exception{
        Account account = getAccount(accId);
        account.withdraw(value);
    }

    public void transfer(int fromAccId, int toAccId,double value) throws Exception{
        Account ac1 = getAccount(fromAccId);
        Account ac2 = getAccount(toAccId);

        if(ac1 == null || ac2 == null){
            if(ac1 == null){
                throw new Exception("Conta do remetente não existe");
            }
                throw new Exception("Conta do destinatário não existe");
        }

        ac1.transfer(ac2, value);
    }

    public void updateMonthly(){
        for(Account c : accounts.values()){
            c.updateMonthly();
        }
    }

    @Override
    public String toString() {
        String out = "- Clients\n";
        for(Client cli : clients.values()){
            out += cli.toString() + "\n";
        }
        out += "- Accounts\n";
        for(Account acc : accounts.values()){
            out += acc.toString();
        }
        return out;
    }


}
