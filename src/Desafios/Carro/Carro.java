/*
Crie uma classe Carro com atributos modelo, ano,
cor e métodos para exibir a ficha técnica e calcular a idade do carro.
 */

package Desafios.Carro;

import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void idadeCarro() {
        int carroIdade;
        int anoAtual = LocalDate.now().getYear();
        carroIdade = anoAtual - ano;
        System.out.println("A idade do carro é: " + carroIdade + " Anos");
    }

    void fichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano do carro " + modelo + " :" + ano);
        System.out.println("Cor do Carro: " + cor);
        idadeCarro();
    }
}