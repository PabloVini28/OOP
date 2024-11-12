class Calculadora{
    
    int battery;
    int batteryMax;
    float display;
    
    Calculadora(int batteryMax){
        this.batteryMax = batteryMax;
        this.display = 0;
        this.battery = 0;
    }
    
    public void charge(int value){
        if(this.battery+value > this.batteryMax ){
            this.battery = this.batteryMax;
        }
        else{
            this.battery += value;
        }
    }
    
    public float sum(int a,int b){
        if(this.battery == 0){
            IO.println("fail: bateria insuficiente");
            return 0;
        }
        else{
            useBattery();
            this.display =  a + b;
            return this.display;
        }
    }
    
    public void div(int num,int den){
        if(this.battery == 0){
            IO.println("fail: bateria insuficiente");
        }
        else if(den == 0){
            useBattery();
            IO.println("fail: divisao por zero");
        }
        else{
            useBattery();
            this.display = (float) num/den;
        }
    }
    
    public boolean useBattery(){
        if(this.battery == 0){
            return false;
        }
        else {
            this.battery -= 1;
            return true;
        }
    }
    
    public String toString(){
        return String.format("display = %.2f, battery = %d", this.display, this.battery);
        
    }
}
class Solver {
    public static void main (String[] arg) {
        
        Calculadora calculadora = null;

        while (true) {
            String line = IO.input();
            IO.println("$" + line);
            String[] args = line.split(" ");

            if      (args[0].equals("end"))   { break;                                 }
            else if (args[0].equals("init"))  { calculadora = new Calculadora(Integer.parseInt(args[1]));                   }
            else if (args[0].equals("charge")) { calculadora.charge(Integer.parseInt(args[1]));                         }
            else if (args[0].equals("sum")) { calculadora.sum(Integer.parseInt(args[1]),Integer.parseInt(args[2]));                         }
            else if (args[0].equals("div")) { calculadora.div(Integer.parseInt(args[1]),Integer.parseInt(args[2]));   }
            else if (args[0].equals("show"))  { IO.println( calculadora.toString() );        }
            else                              { IO.println("fail: comando invalido");  }
        }
    }
}