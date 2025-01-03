class Solver {
    public static void main (String[] args) {
        Trampoline Trampoline = new Trampoline();

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break; }
            else if ( line[0].equals("show")   )  { IO.println( Trampoline.toString() ); }
            else if ( line[0].equals("arrive")   ){ Trampoline.arrive( new Kid( line[1], IO.strToInt(line[2]) ) ); }
            else if ( line[0].equals("enter")  )  { Trampoline.enter();    }
            else if ( line[0].equals("leave")  )  { Trampoline.leave();   }
            else if ( line[0].equals("remove") )  { Trampoline.removeKid( line[1] ); }                                    
            else{ IO.println("fail: comando invalido"); }
        }
    }
}

