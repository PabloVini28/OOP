import java.util.LinkedList;

public class Trampoline {
    
    private LinkedList<Kid> playingKids;
    private LinkedList<Kid> waitingKids;

    private Kid removeFromList(String name, int age){
        for(int i = 0 ; i < playingKids.size() ; i++){
            if(playingKids.get(i).getName().equals(name) && playingKids.get(i).getAge() == age){
                return playingKids.remove(i);
            }
        }
        for(int i = 0 ; i < waitingKids.size() ; i++){
            if(waitingKids.get(i).getName().equals(name) && waitingKids.get(i).getAge() == age){
                return waitingKids.remove(i);
            }
        }
        return null;
    }

    public Trampoline() {
        this.playingKids = new LinkedList<>();
        this.waitingKids = new LinkedList<>();
    }

    public void arrive(Kid kid){
        waitingKids.addFirst(kid);
    }

    public void enter(){
        if(!waitingKids.isEmpty()){
            playingKids.addFirst(waitingKids.removeLast());
        }
    }

    public void leave(){
        if(!playingKids.isEmpty()){
            waitingKids.addFirst(playingKids.removeLast());
        }
    }

    public Kid removeKid(String name){
        for(int i = 0 ; i < playingKids.size() ; i++){
            if(playingKids.get(i).getName().equals(name)){
                return playingKids.remove(i);
            }
        }
        for(int i = 0 ; i < waitingKids.size() ; i++){
            if(waitingKids.get(i).getName().equals(name)){
                return waitingKids.remove(i);
            }
        }
        return null;
    }

    public String toString(){
        
        String saida = "[";
        for(int i = 0 ; i < waitingKids.size() ; i++){
            saida += waitingKids.get(i).toString();
            if(i != waitingKids.size() - 1){
                saida += ", ";
            }
        }
        saida += "] => [";
        for(int i = 0 ; i < playingKids.size() ; i++){
            saida += playingKids.get(i).toString();
            if(i != playingKids.size() - 1){
                saida += ", ";
            }
        }
        
        saida += "]";
        return saida;
        
    }

    

}
