public class Kid {
    private int age;
    private String name;

    Kid(String name, int age){
        setAge(age);
        setName(name);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int number){
        this.age = number;
    }

    public String toString(){
        return this.name + ":" + this.age;
    }
}
