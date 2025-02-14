public class Point2D {
<<<<<<< HEAD
    
    private final double x;
    private final double y;
    
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
=======
    private double x;
    private double y;
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

<<<<<<< HEAD
    public double distance(Point2D p){
=======
    public static double distance(Point2D p){
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
        double cH = this.x - p.getX();
        double cV = this.y - p.getY();
        return Math.sqrt( cH*cH + cV*cV );
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        String out = String.format("(%.2f, %.2f)", this.x,this.y);
=======
        String out = String.format("(%.2f,%.2f)", this.x,this.y);
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
        return out;
    }
    
}
