class Pessoa{
    
    private int age;
    private String name;
    
    Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return getName() + ":" + getAge();
    }
    
}