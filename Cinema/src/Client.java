public class Client {

    private String id;
    private int phone;

    public Client(String id, int phone){
        setId(id);
        setPhone(phone);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public String getId(){
        return this.id;
    }

    public int getPhone(){
        return this.phone;
    }

    @Override
    public String toString(){
        
    }
}
