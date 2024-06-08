/*
Crie uma lista utilizando a interface List e
instancie-a tanto como ArrayList quanto como LinkedList.
Adicione elementos e imprima a lista,
mostrando que é possível trocar facilmente a implementação.
*/

package Desafios_Listas.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);
    }
}