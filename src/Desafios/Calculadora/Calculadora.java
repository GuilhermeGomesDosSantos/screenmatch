/*
Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
 */

package Desafios.Calculadora;

import java.util.Scanner;

public class Calculadora {

    void dobraNumero () {
        double numero;
        double resultado;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número");
        numero = leitura.nextDouble();

        resultado = numero * 2;

        System.out.println("O dobro do número " + numero + " é: " + resultado);
    }
}
