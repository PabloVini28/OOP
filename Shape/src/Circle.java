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
        double distance = center.distance(point);
        return distance <= radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String getInfo(){
    
        String out = "Circ: A=" + String.format("%.2f",getArea()) + " P=" + String.format("%.2f",getPerimeter());
        return out;
    }

    @Override
    public String toString() {
        return String.format("%s: C=%s, R=%.2f", getName(), center.toString(), radius);
    }

    

}
