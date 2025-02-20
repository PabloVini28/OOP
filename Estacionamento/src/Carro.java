class Carro extends Veiculo{
    
    Carro(String id){
        super(id, "Carro");
    }
    
    @Override
    public void calcularValor(int horaSaida){
        float resultado = (horaSaida - getHoraEntrada())/10;
        if(resultado < 5){
            resultado = 5;
        }
        IO.println("Carro chegou " + getHoraEntrada() + " saiu " + horaSaida + ". Pagar R$ " + String.format("%.2f",resultado));
    }
    
}