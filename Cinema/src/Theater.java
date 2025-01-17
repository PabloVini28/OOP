import java.util.ArrayList;

public class Theater {
    
    private ArrayList<Client> seats = new ArrayList<>();


    Theater(int capacity){
        for(int i = 0; i < capacity ; i++){
            this.seats.add(null);
        }
    }

    private int search(String name){
        for(int i = 0 ; i < this.seats.size() ; i++){
            if(this.seats.get(i).getId().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private boolean verifyIndex(int index){
        return index >= 0 && index < this.seats.size();
    }

    public boolean reserve(String id, int phone,int index){
        if(!verifyIndex(index)){
            IO.println("fail: cadeira nao existe");
            return false;
        }
        if(this.seats.get(index)!=null){
            IO.println("fail: cadeira ja esta ocupada");
            return false;
        }
        if(search(id)!= -1){
            IO.println("fail: cliente ja esta no cinema");
            return false;
        }
        this.seats.set(index, new Client(id, phone));
        return true;
    }

    public void cancel(String id){
        if(search(id)!= -1){
            this.seats.set(search(id), null);
        }
        else{
            IO.println("fail: cliente nao esta no cinema");
        }
    }

    public ArrayList<Client> getSeats(){
        return this.seats;
    }

    @Override
    public String toString(){
        String out = "[ ";
        for(int i = 0 ; i < this.seats.size();i++){
            if(this.seats.get(i) == null){
                if(this.seats.size() - 1 == i){
                    out += "-";
                }
                else{
                    out += "- ";
                }
            }
            else{
                if(this.seats.size() - 1 == i){
                    out += this.seats.get(i).getId() + ":" + this.seats.get(i).getPhone();
                }
                else{
                    out += this.seats.get(i).getId() + ":" + this.seats.get(i).getPhone() + " ";
                }
            }
        }
        out += " ]";
        return out;
    }


}