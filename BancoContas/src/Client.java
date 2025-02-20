import java.util.ArrayList;

public class Client {
    
    protected String clientId;
    protected ArrayList<Account> acoounts = new ArrayList<>();

    Client(String name, String clientId){
        this.clientId = clientId;
    }

    public void addAccount( Account acc ) {
        this.acoounts.add(acc);
    }

    public ArrayList<Account> getAccounts() {
        return this.acoounts;
    }
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public String toString() {
        String out = this.clientId + "[";
    }

}
