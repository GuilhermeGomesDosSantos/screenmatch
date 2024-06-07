package Desafios_Listas.Animal;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Dog 1");

        Animal animal = (Animal) dog;
        animal.fazendoAcao();
    }
}
