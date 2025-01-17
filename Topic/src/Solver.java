class Solver {
    public static void main (String[] args) {
        Topic topic = new Topic(0,0);

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      ( line[0].equals("end")    )  { break; }
            else if ( line[0].equals("init")   )  { topic = new Topic( IO.strToInt( line[1] ),IO.strToInt(line[2]) ); }
            else if ( line[0].equals("in") )      { Pass pass = new Pass( line[1] , IO.strToInt(line[2])); 
                topic.insert(pass);
            }
            else if ( line[0].equals("out")   )  { topic.remove(line[1]); }
            else if ( line[0].equals("show")  )  { IO.println( topic.toString() ); }
            else{ IO.println("fail: comando invalido"); }
        }
    }
}
