class Solver {
    public static void main (String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break; }
            else if ( line[0].equals("pagar")   )  { estacionamento.pagar( line[1]); }
            else if ( line[0].equals("estacionar"))  {
                
                Veiculo veiculo = new Bike("teste");
                
                if(line [1].equals("bike")){
                    veiculo = new Bike(line[2]);
                }
                if(line [1].equals("moto")){
                    veiculo = new Moto(line[2]);
                }
                if(line [1].equals("carro")){
                    veiculo = new Carro(line[2]);
                }
                estacionamento.estacionar(veiculo); 
                
            }
            else if ( line[0].equals("tempo") )  { estacionamento.passarTempo( line[1]); }
            else if ( line[0].equals("show")  )  { IO.println( estacionamento.toString() ); }
            else{ IO.println("fail: comando invalido"); }
        }
    }
}