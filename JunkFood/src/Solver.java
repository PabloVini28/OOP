class Solver {
    public static void main (String[] args) {
        VendingMachine machine = new VendingMachine(0);

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break;                                                                               }
            else if ( line[0].equals("show")   )  { IO.println( machine.toString() );                                                     }
            else if ( line[0].equals("init")   )  { machine = new VendingMachine( IO.strToInt(line[1]));}
            
            // else if ( line[0].equals("set"))      {machine.setSlot(IO.strToInt(line[1]), line[2]);  }
            else if ( line[0].equals("set"))      { Slot slot = new Slot( line[2], IO.strToFloat(line[4]), IO.strToInt(line[3]) );
                                                    machine.setSlot( IO.strToInt(line[1]), slot );  }
                                                    //veja o detalhe que a ordem de entrada do usuario está diferente da ordem de entrada do construtor Slot
                                                    //por isso, troquei o line[4] pelo line[3]
            
            else if ( line[0].equals("limpar") )  { machine.clearSlot(IO.strToInt(line[1]));                                                                     }
            else if ( line[0].equals("dinheiro")) { machine.insertCash(IO.strToInt(line[1]));}
            else if ( line[0].equals("troco"))    { machine.withdrawCash();}
            else if (line[0].equals("comprar"))   { machine.buyItem(IO.strToInt(line[1]));} 
            else                                  { IO.println("fail: comando invalido");                                                }
        }
    }
}