/*
Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
Em seguida, crie uma lista de contas bancárias com diferentes saldos.
Utilize um loop para encontrar e imprimir a conta com o maior saldo.
 */

package Desafios_Listas.ContaBancaria;

public class ContaBancaria {
    private int n_Conta;
    private double saldo;

    public int getN_Conta() {
        return n_Conta;
    }

    public void setN_Conta(int n_Conta) {
        this.n_Conta = n_Conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int n_Conta, double saldo) {
        this.n_Conta = n_Conta;
        this.saldo = saldo;
    }
}
