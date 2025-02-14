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
        return Math.abs((P2.getX() - P1.getX()) * (P2.getY() - P1.getY()));
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.abs(P2.getX() - P1.getX()) + Math.abs(P2.getY() - P1.getY()));
    }
    
    @Override
    public String getInfo(){
    
        String out = "Rect: A=" + String.format("%.2f",getArea()) + " P=" + String.format("%.2f",getPerimeter());
        return out;
    }

    
    @Override
    public String toString() {
        return String.format("%s: P1=%s P2=%s", getName(), P1.toString(), P2.toString());
    }
    

}
