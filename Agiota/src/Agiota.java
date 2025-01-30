import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// class Comparador implements Comparator<Client> {
//     public int compare(Client c1, Client c2) {
//         return c1.getName().compareTo(c2.getName());
//     }
// }

class Agiota {

    private ArrayList<Client> aliveList;
    private ArrayList<Client> deathList;
    private ArrayList<Operation> aliveOper;
    private ArrayList<Operation> deathOper;

    private int searchClient(String name) {
        for(int i = 0 ; i < this.aliveList.size() ; i++){
            if(this.aliveList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private void pushOperation(Client client, String name, Label label, int value) {
        Operation oper = new Operation( name, label, value );
        this.aliveOper.add( oper );
        client.addOperation( oper );
    }

    private void sortAliveList() {
        // this.aliveList.sort(); //para inteiros
        // Collections.sort (this.aliveList); //para inteiros

        // this.aliveList.sort( new Comparator<Client>() {
        //     public int compare(Client c1, Client c2) {
        //         return c1.getName().compareTo(c2.getName());
        //         // if (c1.getLimite() < c2.getLimite()) return -1;
        //         // else if (c1.getLimite() > c2.getLimite()) return 1;
        //         // else return 0;
        //     }
        // });

        // Collections.sort (this.aliveList, new Comparator<Client>() {
        //     public int compare(Client c1, Client c2) {
        //         return c1.getName().compareTo(c2.getName());
        //     }
        // });

        // Collections.sort (this.aliveList, new Comparador());
    }

    public Agiota() {
        this.aliveList = new ArrayList<>();
        this.aliveOper = new ArrayList<>();
        this.deathList = new ArrayList<>();
        this.deathOper = new ArrayList<>();
    }

    public Client getClient(String name) {
        for(int i = 0 ; i < this.aliveList.size() ; i++){
            if(this.aliveList.get(i).getName().equals(name)){
                return this.aliveList.get(i);
            }
        }
        return null;
    }

    public void addClient(String name, int limite) { //throws Exception 

        if(getClient(name) != null){
            IO.println("fail: cliente ja existe");
            return;
        }
        Client client = new Client(name, limite);
        this.aliveList.add(client);
    }

    public void give(String name, int value) { // throws Exception
        Client cl = getClient(name);
        pushOperation(cl, name, Label.GIVE, value);
    }

    public void take(String name, int value) { // throws Exception 
    }

    public void kill(String name) {
    }

    public void plus() {
        for (Client client : this.aliveList) {
            this.pushOperation( client, client.getName(), Label.PLUS, (int) Math.ceil( 0.1*client.getBalance() ) );
        }
        // for (Client client : this.aliveList) {
        //     if ( client.getBalance() > client.getLimite() ) {
        //         this.kill( client.getName() );
        //     }
        // }
        for (int i=0; i<this.aliveList.size(); i++) {
            Client client = this.aliveList.get(i);
            if ( client.getBalance() > client.getLimite() ) {
                this.kill( client.getName() );
                i--;
            }
        }
    }

    @Override
    public String toString() {
        String ss = "";
        for ( Client client : this.aliveList ) {
            ss += ":) " + client.getName() + " " + client.getBalance() + "/" + client.getLimite() + "\n";
        }
        for ( Operation oper : this.aliveOper ) {
            ss += "+ " + oper + "\n";
        }
        for ( Client client : this.deathList ) {
            ss += ":( " + client.getName() + " " + client.getBalance() + "/" + client.getLimite() + "\n";
        }
        for ( Operation oper : this.deathOper ) {
            ss += "- " + oper + "\n";
        }
        return ss;
    }
}
