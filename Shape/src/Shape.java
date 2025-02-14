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
<<<<<<< HEAD
    public abstract String getInfo();
=======
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9

    @Override
    public String toString() {
        return this.name;
<<<<<<< HEAD
    }  
=======
    }

    
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9

}
