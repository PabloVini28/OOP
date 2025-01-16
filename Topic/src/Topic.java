import java.util.ArrayList;

public class Topic {
    
    private ArrayList<Pass> prioritySeats;
    private ArrayList<Pass> normalSeats;

    Topic(int capacity, int qtdPriority){
        for(int i = 0 ; i < qtdPriority ; i++){
            prioritySeats.add(null);
        }
        for(int i = 0 ; i< capacity - qtdPriority ; i++){
            normalSeats.add(null);
        }
    }

    public boolean insert(Pass pass){
        if(pass.isPriority()){
            for(int i = 0 ; i < prioritySeats.size() ; i++){
                if(prioritySeats.get(i) == null){
                    prioritySeats.set(i, pass);
                    return true;
                }
            }
            for(int i = 0 ; i < normalSeats.size() ; i++){
                if(normalSeats.get(i) == null){
                    normalSeats.set(i, pass);
                    return true;
                }
            }
        }
        else{
            for(int i = 0 ; i < normalSeats.size() ; i++){
                if(normalSeats.get(i) == null){
                    normalSeats.set(i, pass);
                    return true;
                }
            }
            for(int i = 0 ; i < prioritySeats.size() ; i++){
                if(prioritySeats.get(i) == null){
                    prioritySeats.set(i, pass);
                    return true;
                }
            }
        }
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
        
    }

}
