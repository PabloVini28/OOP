class Moto extends Veiculo{
    
    Moto(String id){
        super(id, "Moto");
    }
    
    @Override
    public void calcularValor(int horaSaida){
        float resultado = (horaSaida - getHoraEntrada())/20;
        IO.println("Moto chegou " + getHoraEntrada() + " saiu " + horaSaida + ". Pagar R$ " + String.format("%.2f",resultado));
    }
    
}