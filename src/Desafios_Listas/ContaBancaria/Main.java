package Desafios_Listas.ContaBancaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listBank = new ArrayList<>();

        ContaBancaria bank_1 = new ContaBancaria(123, 12.055);
        listBank.add(bank_1);

        ContaBancaria bank_2 = new ContaBancaria(456, 3.038);
        listBank.add(bank_2);

        ContaBancaria bank_3 = new ContaBancaria(789, 1.008);
        listBank.add(bank_3);

        ContaBancaria contaSaldoMaior = listBank.get(0);


        for (ContaBancaria bank : listBank) {
            System.out.println("N° Conta: " + bank.getN_Conta() + ", Saldo: R$:" + bank.getSaldo());

            if (bank.getSaldo() > contaSaldoMaior.getSaldo()) {
                contaSaldoMaior = bank;
            }
        }
        System.out.println("A conta com o Maior valor é: " + "\n" + "N° Conta: " + contaSaldoMaior.getN_Conta() + "\n" + "Saldo: R$:" + contaSaldoMaior.getSaldo());
    }
}
