package Desafios_Listas.Animal;

public class Main {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Dog 1");

        if (dog instanceof Cachorro && dog.getNome() == "Dog 123") {
            System.out.println("O nome é Dog 1");
        } else {
            System.out.println("É outro nome");
        }
//
        Animal animal = (Animal) dog;
        animal.fazendoAcao();
    }
}
