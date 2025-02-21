import java.util.ArrayList;

public class Client{
    
    protected String clientId;
    protected ArrayList<Account> accounts = new ArrayList<>();

    public Client(String clientId){
        this.clientId = clientId;
    }

    public void addAccount( Account acc ) {
        this.accounts.add(acc);
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public String toString() {
        String out = this.clientId + " [";

        for(int i = 0 ; i < this.accounts.size() ; i++){
            out += accounts.get(i).getId();
            if(i < accounts.size()-1) out += ", ";
        }
        out += ']';
        return out;
    }

}
