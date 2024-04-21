/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/

package Desafios.Banco;

import java.util.Scanner;

public class Banco {

    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O valor a ser depositado é: R$" + valor + "\n" + "Saldo Atual: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("O valor a ser retirado é de: R$" + valor + "\n" + "Saldo Atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo Atual: " + saldo);
    }
}
