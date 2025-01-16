class Solver {
    public static void main (String[] args) {
        Market market = new Market(0);

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break; }
            else if ( line[0].equals("init")   )  { market = new Market( IO.strToInt( line[1] ) ); }
            else if ( line[0].equals("arrive") )  { market.arrive( new Person( line[1] ) ); }
            else if ( line[0].equals("call")   )  { market.call( IO.strToInt( line[1] ) ); }
            else if ( line[0].equals("finish") )  { market.finish( IO.strToInt( line[1] ) ); }
            else if ( line[0].equals("print")  )  { IO.println( market.toString() ); }
            else{ IO.println("fail: comando invalido"); }
        }
    }
}