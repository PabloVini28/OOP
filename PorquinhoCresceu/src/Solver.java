import java.util.Scanner;

public class Solver {
    public static void main(String[] arg) {
        Pig pig = new Pig(5);

        OUTER:
        while (true) {
            String line = input();
            println("$" + line);
            String[] args = line.split(" ");
            try {
                switch (args[0]) {
                    case "end" -> {
                        break OUTER;
                    }
                    case "init" -> pig = new Pig( (int) number(args[1]) );
                    case "show" -> println(pig);
                    case "addCoin" -> pig.addCoin( pig.createCoin( args[1] ) );
                    case "addItem" -> pig.addItem( new Item( args[1], (int) number(args[2]) ) );
                    case "break" -> pig.breakPig();
                    case "extractCoins" -> println("[" + String.join(", ", pig.extractCoins()) + "]");
                    case "extractItems" -> println("[" + String.join(", ", pig.extractItems()) + "]");
                    default -> println("fail: comando invalido");
                }
            }catch (Exception e) {
                println(e.getMessage());
                // e.printStackTrace(System.out);
            }
        }
    }

    private final static Scanner scanner = new Scanner(System.in);
    private static String  input()                { return scanner.nextLine();        }
    private static double  number(String value)   { return Double.parseDouble(value); }
    public  static void    println(Object value)  { System.out.println(value);        }
    public  static void    print(Object value)    { System.out.print(value);          }
}