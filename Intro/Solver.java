import java.util.*;

class IO{
    
    public static Scanner scan =  new Scanner(System.in);
    
    public static void print(String linha){
        System.out.println(linha);
    }
    
    public static String input(){
        return scan.nextLine();
    }
    public static int inputInt(){
        return Integer.parseInt(scan.nextLine());
    }
    public static float inputFloat(){
        return Float.parseFloat(scan.nextLine());
    }
    public static double inputDouble(){
        return Double.parseDouble(scan.nextLine());
    }
}

class Solver{
    public static void main(String[] args) {
        String nome = IO.input();
        IO.print("Nome = " + nome);
        String mat = IO.input();
        IO.print("Matrícula = " + mat);
        String disciplina = IO.input();
        IO.print("Disciplina = " + disciplina);
        float nota = IO.inputFloat();
        IO.print("Nota = " + nota);
    }
}

