/*
1 - Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
 */

package Desafios_Listas.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.add("Ruby");

        System.out.println("Linguagens de Programação: ");
        list.forEach(listLinguagens -> System.out.println(listLinguagens));

//        for (String linguagens : list) {
//            System.out.println(linguagens);
//        }
    }
}
