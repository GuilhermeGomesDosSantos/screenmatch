/*
Crie uma classe ConversorMoeda que implementa uma interface
ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.
*/

package Desafios.ConversorMoeda;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira {
    double valorDolar;

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public void converterDolarParaReal() {
        double cotacao = 5.12;
        double valorReal = getValorDolar() * cotacao;
        System.out.println("O valor de U$" + getValorDolar() + " para R$ é de: R$" + valorReal);
    }
}
