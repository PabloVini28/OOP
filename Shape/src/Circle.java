public class Circle extends Shape{
    
    private final Point2D center;
    private final double radius;

    Circle(Point2D center, double radius) {
        super("Circ");
        this.center = center;
        this.radius = radius;    
    }

    @Override
    public boolean inside(Point2D point) {
<<<<<<< HEAD
        double distance = center.distance(point);
        return distance <= radius;
=======
        return 
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
    }

    @Override
    public double getArea() {
<<<<<<< HEAD
        return Math.PI * this.radius * this.radius;
=======
        return 3.14 * this.radius * this.radius;
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
    }

    @Override
    public double getPerimeter() {
<<<<<<< HEAD
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String getInfo(){
    
        String out = "Circ: A=" + String.format("%.2f",getArea()) + " P=" + String.format("%.2f",getPerimeter());
        return out;
=======
        return 2 * 3.14 * this.radius;
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
    }

    @Override
    public String toString() {
        return String.format("%s: C=%s, R=%.2f", getName(), center.toString(), radius);
    }

    

}
