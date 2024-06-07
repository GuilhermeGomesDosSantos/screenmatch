package Desafios_Listas.Animal;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazendoAcao() {
        System.out.println("O " + getNome() + " está abanando o Rabo");
    }
}
