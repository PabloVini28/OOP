class Bike extends Veiculo{
    
    Bike(String id){
        super(id, "Bike");
    }
    
    @Override
    public void calcularValor(int horaSaida){
        IO.println("Bike chegou " + getHoraEntrada() + " saiu " + horaSaida + ". Pagar R$ 3.00");
    }
    
}