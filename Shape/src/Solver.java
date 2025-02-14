import java.util.ArrayList;
import java.util.Scanner;

public class Solver {
    
    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] arg) {
        ArrayList<Shape> shapes = new ArrayList<>();

        OUTER:
        while (true) {
            String line = input();
            println("$" + line);
            String[] args = line.split(" ");
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

    private static String  input()                { return scanner.nextLine();        }
    private static double  number(String value)   { return Double.parseDouble(value); }
    public  static void    println(Object value)  { System.out.println(value);        }
    public  static void    print(Object value)    { System.out.print(value);          }
    public  static void    showAll(ArrayList<Shape> shapes) { for ( Shape s : shapes ) println( s ); }
    public  static void infoAll( ArrayList<Shape> shapes ) { for ( Shape s : shapes ) println( s.getInfo() ); }
} 
