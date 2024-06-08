/*
Modifique o Exercício 4 para declarar
a variável de lista como a interface List,
demonstrando o uso de polimorfismo.
*/

package Desafios_Listas.ListPolimorfismo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listPoli;
        listPoli = new ArrayList<>();

        listPoli.add("Elemento 1");
        listPoli.add("Elemento 2");
        System.out.println("ArrayList: " + listPoli);

        listPoli = new LinkedList<>();
        listPoli.add("Elemento A");
        listPoli.add("Elemento B");

        System.out.println("LinkedList: " + listPoli);
    }
}