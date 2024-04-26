/*
Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
 */

package Desafios.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
      double celsius;
      celsius = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println("A temperatura de Celsius " + temperaturaCelsius + " Graus para fahrenheit é: " + celsius + " - Graus Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        double fahrenheit;

        fahrenheit = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura de Fahrenheit " + temperaturaFahrenheit + " Graus para Celsius é: " + fahrenheit + "- Graus Celsius");
    }
}
