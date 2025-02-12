abstract public class Shape {
    
    private final String name;

    Shape(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract boolean inside(Point2D point);
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return this.name;
    }

    

}
