class Carro {
    public int pass;
    public int passMax;
    public int gas;
    public int gasMax;
    public int km;
    
    
    Carro(){
        this.gas = 0;
        this.gasMax = 100;
        this.pass = 0;
        this.passMax = 2;
        this.km = 0;
    }
    
    public void enter(){
        if(this.pass == 2){
            IO.println("fail: limite de pessoas atingido");
        }
        else{
            this.pass += 1;
        }
    }
    
    public void leave(){
        if(this.pass == 0){
            IO.println("fail: nao ha ninguem no carro");
        }
        else{
            this.pass -= 1;
        }
    }
    
    public void drive(int value){
        if(this.pass == 0){
            IO.println("fail: nao ha ninguem no carro");
            return;
        }
        if(this.gas == 0){
            IO.println("fail: tanque vazio");
        }
        else if(this.gas < value){
            IO.println("fail: tanque vazio apos andar "+ this.gas + " km");
            this.km += this.gas;
            this.gas = 0;
        }
        else if(this.gas >= value){
            this.km += value;
            this.gas -= value;
        }
        
        
    }
    
    public void fuel(int value){
        if((value + this.gas) > this.gasMax){
            this.gas = 100;
        }
        else{
            this.gas += value;
        }
    }
    
    public String toString(){
        String aux = "pass: " + this.pass + ", gas: " + this.gas + ", km: " + this.km;
        return aux;
    }
    
}
class Solver {
    public static void main (String[] arg) {
        Carro carro = new Carro();

        while (true) {
            String line = IO.input();
            IO.println("$" + line);
            String[] args = line.split(" ");

            if      (args[0].equals("end"))   { break;                                 }
            else if (args[0].equals("init"))  { carro = new Carro();                   }
            else if (args[0].equals("enter")) { carro.enter();                         }
            else if (args[0].equals("leave")) { carro.leave();                         }
            else if (args[0].equals("drive")) { carro.drive( IO.strToInt(args[1]) );   }
            else if (args[0].equals("fuel"))  { carro.fuel( IO.strToInt(args[1]) );    }
            else if (args[0].equals("show"))  { IO.println( carro.toString() );        }
            else                              { IO.println("fail: comando invalido");  }
        }
    }
}