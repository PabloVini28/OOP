class Moto{
    
    private Pessoa pessoa;
    private int power;
    private int time=0;
    
    
    Moto(int power){
        this.power = power;
    }
    
    public boolean insertPerson(Pessoa pessoa){
        if(this.pessoa != null){
            IO.println("fail: busy motorcycle");
            return false;
        }
        this.pessoa = pessoa;
        return true;
    }
    
    public Pessoa remove(){
        if(getPerson() == null){
            IO.println("fail: empty motorcycle");
            return null;
        }
        IO.println(pessoa);
        pessoa = null;
        return pessoa;
    }
    
    public void buyTime(int time){
        this.time += time;
        return;
    }
    
    public void drive(int time){
        
        if(getTime() == 0){
            IO.println("fail: buy time first");
            return;
        }
        
        if(getPerson() == null){
            IO.println("fail: empty motorcycle");
            return;
        }
        
        if(pessoa.getAge() > 10){
            IO.println("fail: too old to drive");
            return;
        }
        if(this.time - time < 0){
            IO.println("fail: time finished after " + this.time + " minutes");
            this.time = 0;
            return;
        }
        
        this.time -= time;       
        
    }
    
    public void honk(){

        IO.print("P");
        for(int i = 0 ; i < getPower() ; i++){
            IO.print("e");
        }
        IO.println("m");
    }
    
    public Pessoa getPerson(){
        return this.pessoa;
    }
    
    public int getPower(){
        return this.power;
    }
    
    public int getTime(){
        return this.time;
    }
    
    public String toString(){
        if(getPerson() == null){
            return "power:"+getPower()+", time:" + getTime() + ", person:(empty)";
        }
        return "power:"+getPower()+", time:" + getTime() + ", person:(" + pessoa.getName() + ":" + pessoa.getAge()+")";
    }
     
}