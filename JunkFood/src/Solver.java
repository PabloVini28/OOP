class Solver {
    public static void main (String[] args) {
        VendingMachine machine = new VendingMachine(0);

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break;                                                                               }
            else if ( line[0].equals("show")   )  { IO.println( machine.toString() );                                                     }
            else if ( line[0].equals("init")   )  { machine = new VendingMachine( IO.strToInt(line[1]));}
            else if ( line[0].equals("set"))      {machine.setSlot(IO.strToInt(line[1]), line[2], IO.strToInt(line[3]), IO.strToFloat(line[4]));  }
            else if ( line[0].equals("limpar") )  { machine.clearSlot(IO.strToInt(line[1]));                                                                     }
            else if ( line[0].equals("dinheiro")) { machine.insertCash(IO.strToInt(line[1]));}
            else if ( line[0].equals("troco"))    { machine.withdrawCash();}
            else if (line[0].equals("comprar"))   { machine.buyItem(IO.strToint(line[1]));} 
            else                                  { IO.println("fail: comando invalido");                                                }
        }
    }
}