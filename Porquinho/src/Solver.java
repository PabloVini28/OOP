public class Solver {
    public static void main(String[] arg) {
        Pig pig = new Pig(0);

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      (line[0].equals("end"))     { break; }
            else if (line[0].equals("init"))    { pig = new Pig(IO.strToInt(line[1])); }
            else if (line[0].equals("show"))    { IO.print(pig); }
            else if (line[0].equals("addItem")) {  
                Item item = new Item(line[1], IO.strToInt(line[2]));
                pig.addItem(item);
            }
            else if (line[0].equals("addCoin"))  { 
                if(IO.strToInt(line[1]) == 10){
                    Coin coin = Coin.C10;
                    pig.addCoin(coin);
                }
                if(IO.strToInt(line[1]) == 25){
                    Coin coin = Coin.C25;
                    pig.addCoin(coin);
                }
                if(IO.strToInt(line[1]) == 50){
                    Coin coin = Coin.C50;
                    pig.addCoin(coin);
                }
                if(IO.strToInt(line[1]) == 100){
                    Coin coin = Coin.C100;
                    pig.addCoin(coin);
                }
            }
            else if (line[0].equals("extractItems")){ pig.extractItems(); }
            else if (line[0].equals("extractCoins"))    { pig.extractCoins(); }
            else if (line[0].equals("break"))    { pig.breakPig(); }
            else                                { IO.println("fail: comando invalido"); }
        }
    }
}