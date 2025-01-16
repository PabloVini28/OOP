public class Pass {
    private int age;
    private String name;

    Pass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isPriority(){
        if(this.age > 64){
            return true;
        }
        else return false;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}
