public class Rectangle extends Shape{
    
    private final Point2D P1;
    private final Point2D P2;

    public Rectangle(Point2D P1, Point2D P2) {
        super("Rect");
        this.P1 = P1;
        this.P2 = P2;
    }

    @Override
    public boolean inside(Point2D point) {
        return point.getX() >= this.P1.getX() && point.getX() <= P2.getX() &&
        point.getY() >= P2.getY() && point.getY() <= P1.getY();
    }

    @Override
    public double getArea() {
<<<<<<< HEAD
        return Math.abs((P2.getX() - P1.getX()) * (P2.getY() - P1.getY()));
=======
        return (this.P2.getX() - this.P1.getX()) * (this.P1.getY() - this.P2.getY());
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
    }

    @Override
    public double getPerimeter() {
<<<<<<< HEAD
        return 2 * (Math.abs(P2.getX() - P1.getX()) + Math.abs(P2.getY() - P1.getY()));
    }
    
    @Override
    public String getInfo(){
    
        String out = "Rect: A=" + String.format("%.2f",getArea()) + " P=" + String.format("%.2f",getPerimeter());
        return out;
=======
        return 2* ((P2.getX() - P1.getX()) + (P1.getY() - P2.getY()));
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
    }

    
    @Override
    public String toString() {
        return String.format("%s: P1=%s P2=%s", getName(), P1.toString(), P2.toString());
    }
    

}
