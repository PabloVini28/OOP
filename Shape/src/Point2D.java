public class Point2D {
    
    private final double x;
    private final double y;
    
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(Point2D p){
        double cH = this.x - p.getX();
        double cV = this.y - p.getY();
        return Math.sqrt( cH*cH + cV*cV );
    }

    @Override
    public String toString() {
        String out = String.format("(%.2f, %.2f)", this.x,this.y);
        return out;
    }
    
}
