class Animal{
    String especie;
    String barulho;
    int idade;
    
    Animal(String especie,String barulho){
        this.especie = especie;
        this.barulho = barulho;
        this.idade = 0;
    }
    
    String fazerBarulho(){
        if(this.idade == 0){
            return "---";
        }
        if(this.idade == 4){
            return "RIP";
        }
        return this.barulho;
    }
    
    void envelhecer(int qtd){
        
        if(this.idade <= 3){
         this.idade += qtd;            
        }

        if(this.idade >= 4){
            IO.println("warning: " + this.especie + " morreu");
        }
    }
    
    String imprimir(){
        return (this.especie + ":" + this.idade + ":" + this.barulho);
    }
    
}

 
class Solver {
    public static void main (String[] arg) {
        Animal animal = new Animal("", "");

        while (true) {
            String line = IO.input();
            IO.println("$" + line);
            String[] args = line.split(" ");

            if      (args[0].equals("end"))   { break;                                     }
            else if (args[0].equals("init"))  { animal = new Animal(args[1], args[2]);     }
            else if (args[0].equals("grow"))  { animal.envelhecer( IO.strToInt(args[1]) ); }
            else if (args[0].equals("noise")) { IO.println( animal.fazerBarulho() );       }
            else if (args[0].equals("show"))  { IO.println( animal.imprimir() );           }
            else                              { IO.println("fail: comando invalido");      }
        }
    }
}
