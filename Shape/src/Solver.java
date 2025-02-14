<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Solver {
    
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] arg) {
        ArrayList<Shape> shapes = new ArrayList<>();

        OUTER:
=======
public class Solver {
    public static void main(String[] arg) {
        Circle shape = new Circle( new Point2D(0,0), 0 );
        // Rectangle shape = new Rectangle( new Point2D(0,0), new Point2D(0,0) );

>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
        while (true) {
            String line = input();
            println("$" + line);
            String[] args = line.split(" ");
<<<<<<< HEAD
            switch (args[0]) {
                case "end" -> {
                    break OUTER;
                }
                case "circle" -> shapes.add( new Circle( new Point2D( number(args[1]), number(args[2]) ), number(args[3]) ) );
                case "rect" -> shapes.add( new Rectangle( new Point2D( number(args[1]), number(args[2]) ), new Point2D( number(args[3]), number(args[4]) ) ) );
                case "show" -> showAll( shapes );
                case "info" -> infoAll( shapes );
                default -> println("fail: comando invalido");
            }
        }
    }

=======

            if      (args[0].equals("end"))       { break; }
            else if (args[0].equals("circle"))    { shape = new Circle( new Point2D( number(args[1]), number(args[2]) ), number(args[3]) ); }
            // else if (args[0].equals("rect"))      { shape = new Rectangle( new Point2D( number(args[1]), number(args[2]) ), new Point2D( number(args[3]), number(args[4]) ) ); }
            else if (args[0].equals("show"))      { println(shape); }
            // else if (args[0].equals("circle"))    { shapes.add( new Circle( new Point2D( number(args[1]), number(args[2]) ), number(args[3]) ) ); }
            // else if (args[0].equals("rect"))      { shapes.add( new Rectangle( new Point2D( number(args[1]), number(args[2]) ), new Point2D( number(args[3]), number(args[4]) ) ) ); }
            // else if (args[0].equals("show"))      { showAll( shapes ); }
            // else if (args[0].equals("info"))      { infoAll( shapes ); }
            else                                { println("fail: comando invalido"); }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
    private static String  input()                { return scanner.nextLine();        }
    private static double  number(String value)   { return Double.parseDouble(value); }
    public  static void    println(Object value)  { System.out.println(value);        }
    public  static void    print(Object value)    { System.out.print(value);          }
<<<<<<< HEAD
    public  static void    showAll(ArrayList<Shape> shapes) { for ( Shape s : shapes ) println( s ); }
    public  static void infoAll( ArrayList<Shape> shapes ) { for ( Shape s : shapes ) println( s.getInfo() ); }
} 
=======
    // public  static void showAll( ArrayList<Shape> shapes ) { for ( Shape s : shapes ) println( s ); }
    // public  static void infoAll( ArrayList<Shape> shapes ) { for ( Shape s : shapes ) println( s.getInfo() ); }
}
>>>>>>> 8653f2946ffdaac19ef3d3b42b6489591f28b2d9
