package Desafios.CarroModelo;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        ModeloCarro modelCar = new ModeloCarro();

        car.definirModelo("Esportivo");
        car.definirPreco(50000, 150000, 600000);
        modelCar.setPlacaModelo("placa Teste");
        car.exibeInformacao();
    }
}