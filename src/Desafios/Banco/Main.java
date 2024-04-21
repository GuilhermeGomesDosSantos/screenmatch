package Desafios.Banco;

public class Main {
    public static void main(String[] args) {
        Banco bank = new Banco();

        bank.consultarSaldo();
        bank.depositar(1000);
        bank.sacar(10);

    }

}
