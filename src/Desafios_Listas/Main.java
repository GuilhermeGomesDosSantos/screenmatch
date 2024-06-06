package Desafios_Listas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano 1", 20);
        Pessoa p2 = new Pessoa("Fulano 2", 29);
        Pessoa p3 = new Pessoa("Fulano 3", 53);

        ArrayList<Pessoa> listPeople = new ArrayList<>();

        listPeople.add(p1);
        listPeople.add(p2);
        listPeople.add(p3);
        System.out.println("O tamanho da Lista de Pessoas é: " + listPeople.size());

        System.out.println("A primeira pessoa da lista é: " + listPeople.get(0).toString());
        System.out.println("A primeira pessoa da lista é: " + listPeople.get(0));

//        System.out.println("A lista completa é: " + listPeople);

        System.out.println("Lista de Pessoas: ");
        for (Pessoa pessoa: listPeople) {
            System.out.println(pessoa);
        }
    }
}
