class Solver {
    public static void main (String[] args) {
        Theater theater = new Theater( 0 );

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break;                                                                               }
            else if ( line[0].equals("show")   )  { IO.println( theater.toString() );                                                     }
            else if ( line[0].equals("init")   )  { theater = new Theater( IO.strToInt(line[1]) );                                       }
            else if ( line[0].equals("reservar") ){ theater.reserve(line[1],IO.strToInt(line[2]),IO.strToInt(line[3]));  }
            else if ( line[0].equals("cancelar") ){ theater.cancel(line[1]);                                                                     }
            else                                  { IO.println("fail: comando invalido");                                                }
        }
    }
}