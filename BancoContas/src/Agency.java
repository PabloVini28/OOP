import java.util.HashMap;
import java.util.Map;

public class Agency {
    
    private final Map<Integer,Account> accounts;
    private final Map<String, Client> clients;
    private int nextAccountId;

    private Account getAccount(int accountId){
        try {
            return this.accounts.get(accountId);
        } catch (Exception e) {
            
        }
    }

    Agency(){
        accounts = new HashMap<>();
        clients = new HashMap<>();

    }

    public void addClient(String clientId){
        
    }

    public void deposit(int accId, double value){
        Account account = getAccount(accId);
        account.deposit(value);
    }

    public void withdraw(int accId, double value) throws Exception{
        Account account = getAccount(accId);
        account.withdraw(value);
    }


}
