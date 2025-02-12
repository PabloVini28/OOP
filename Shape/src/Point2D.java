public class Point2D {
    private double x;
    private double y;

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public static double distance(Point2D p){
        double cH = this.x - p.getX();
        double cV = this.y - p.getY();
        return Math.sqrt( cH*cH + cV*cV );
    }

    @Override
    public String toString() {
        String out = String.format("(%.2f,%.2f)", this.x,this.y);
        return out;
    }
    
}
