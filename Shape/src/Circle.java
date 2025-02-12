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
        return 
    }

    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    @Override
    public String toString() {
        return String.format("%s: C=%s, R=%.2f", getName(), center.toString(), radius);
    }

    

}
