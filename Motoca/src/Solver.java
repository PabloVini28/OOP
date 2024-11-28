class Solver {
    public static void main (String[] args) {
        Moto m = new Moto(1);

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if( line[0].equals("end")    )  { break;                                                                               }
            else if ( line[0].equals("show")   )  { IO.println( m.toString() );                                                     }
            else if ( line[0].equals("init")   )  { m = new Moto( IO.strToInt(line[1]) );                                       }
            else if ( line[0].equals("enter") )   { m.insertPerson(new Pessoa(line[1], IO.strToInt(line[2])));  }
            else if ( line[0].equals("leave") )   { m.remove();                                                                          }
            else if ( line[0].equals("buy")  )    { m.buyTime(IO.strToInt(line[1]));                                                                  }
            else if ( line[0].equals("honk")   )  { m.honk();                                                                            } 
            else if ( line[0].equals("drive"))    { m.drive(IO.strToInt(line[1]));}
            else                                  { IO.println("fail: comando invalido");                                                }
        }
    }
}
