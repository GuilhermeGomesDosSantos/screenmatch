package Desafios.ConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.celsiusParaFahrenheit(25);
        conversor.fahrenheitParaCelsius(77);
    }
}
