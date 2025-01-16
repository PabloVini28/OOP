import java.util.ArrayList;

public class Topic {
    
    private ArrayList<Pass> prioritySeats = new ArrayList<Pass>();
    private ArrayList<Pass> normalSeats = new ArrayList<Pass>();

    Topic(int capacity, int qtdPriority){
        for(int i = 0 ; i < qtdPriority ; i++){
            this.prioritySeats.add(null);
        }
        for(int i = 0 ; i< capacity - qtdPriority ; i++){
            this.normalSeats.add(null);
        }
    }

    public boolean insert(Pass pass) {
        if (pass.isPriority()) {
            // Tenta inserir em assentos prioritários
            for (int i = 0; i < this.prioritySeats.size(); i++) {
                if (this.prioritySeats.get(i) != null && 
                    this.prioritySeats.get(i).getName().equals(pass.getName()) &&
                    this.prioritySeats.get(i).getAge() == pass.getAge()) {
                    IO.println("fail: " + pass.getName() + " ja esta na topic");
                    return false;
                }
            }
            for (int i = 0; i < this.prioritySeats.size(); i++) {
                if (this.prioritySeats.get(i) == null) {
                    this.prioritySeats.set(i, pass);
                    return true;
                }
            }
            // Tenta inserir em assentos normais
            for (int i = 0; i < this.normalSeats.size(); i++) {
                if (this.normalSeats.get(i) != null && 
                    this.normalSeats.get(i).getName().equals(pass.getName()) &&
                    this.normalSeats.get(i).getAge() == pass.getAge()) {
                    IO.println("fail: " + pass.getName() + " ja esta na topic");
                    return false;
                }
            }
            for (int i = 0; i < this.normalSeats.size(); i++) {
                if (this.normalSeats.get(i) == null) {
                    this.normalSeats.set(i, pass);
                    return true;
                }
            }
        } else {
            // Tenta inserir em assentos normais
            for (int i = 0; i < this.normalSeats.size(); i++) {
                if (this.normalSeats.get(i) != null && 
                    this.normalSeats.get(i).getName().equals(pass.getName()) &&
                    this.normalSeats.get(i).getAge() == pass.getAge()) {
                    IO.println("fail: " + pass.getName() + " ja esta na topic");
                    return false;
                }
            }
            for (int i = 0; i < this.normalSeats.size(); i++) {
                if (this.normalSeats.get(i) == null) {
                    this.normalSeats.set(i, pass);
                    return true;
                }
            }
            
            for (int i = 0; i < this.prioritySeats.size(); i++) {
                if (this.prioritySeats.get(i) != null && 
                    this.prioritySeats.get(i).getName().equals(pass.getName()) &&
                    this.prioritySeats.get(i).getAge() == pass.getAge()) {
                    IO.println("fail: " + pass.getName() + " ja esta na topic");
                    return false;
                }
            }
            for (int i = 0; i < this.prioritySeats.size(); i++) {
                if (this.prioritySeats.get(i) == null) {
                    this.prioritySeats.set(i, pass);
                    return true;
                }
            }
        }
        IO.println("fail: topic lotada");
        return false;
    }
    

    public boolean remove(String name){
        for(int i = 0 ; i < prioritySeats.size() ; i++){
            if(prioritySeats.get(i) != null && prioritySeats.get(i).getName().equals(name)){
                prioritySeats.set(i, null);
                return true;
            }
        }
        for(int i = 0 ; i < normalSeats.size() ; i++){
            if(normalSeats.get(i) != null && normalSeats.get(i).getName().equals(name)){
                normalSeats.set(i, null);
                return true;
            }
        }
        IO.println("fail: " + name +" nao esta na topic");
        return false;
    }

    public static int findFree(ArrayList<Pass> seats){
        for(int i = 0 ; i < seats.size() ; i++){
            if(seats.get(i) == null){
                return i;
            }
        }
        return -1;
    }

    public static int findName(ArrayList<Pass> seats, String name){
        for(int i = 0 ; i < seats.size() ; i++){
            if(seats.get(i) != null && seats.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public static boolean insert(ArrayList<Pass> seats, Pass pass){
        seats.set(findFree(seats), pass);
        return false;
    }

    public static boolean remove(ArrayList<Pass> seats, String name){
        seats.set(findName(seats, name), null);
        return false;
    }

    @Override
    public String toString(){
        if(this.prioritySeats.size() == 0 && this.normalSeats.size() == 0){
            return "[]";
        }
        String str = "[";
        for(int i = 0 ; i < this.prioritySeats.size() ; i++){
            if(this.prioritySeats.get(i) == null){
                str += "@ ";
            }
            else{
                str += "@" + this.prioritySeats.get(i).getName() + ":" + this.prioritySeats.get(i).getAge() + " ";
            }
        }
        for(int i = 0 ; i < this.normalSeats.size() ; i++){
            if(this.normalSeats.get(i) == null){
                if(i == this.normalSeats.size()-1){
                    str += "=";
                }
                else{
                    str += "= ";
                }
            }
            else{
                if(i == this.normalSeats.size()-1){
                    str += "=" + this.normalSeats.get(i).getName() + ":" + this.normalSeats.get(i).getAge();
                }
                else{
                str += "=" + this.normalSeats.get(i).getName() + ":" + this.normalSeats.get(i).getAge() + " ";
                }
            
            }   
        }
        return str + "]";
    }

}
