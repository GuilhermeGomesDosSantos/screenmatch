package Desafios.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria bank = new ContaBancaria();

        bank.setSaldo(5000);
        bank.setNumeroConta(123456789);
        System.out.println("N° da conta: " + bank.getNumeroConta());
        System.out.println("Saldo atual: " + bank.getSaldo());
    }
}
