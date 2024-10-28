    class Solver {
        public static void main (String[] args) {
            String nome = IO.input();
            float nota01 = IO.inputFloat();
            float nota02 = IO.inputFloat();
            float nota03 = IO.inputFloat();

            float notaFinal = (nota01+nota02+nota03)/3;
            IO.println(String.format("%.2f", notaFinal));
        }
    }
