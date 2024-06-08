/*
Crie uma lista de números inteiros e
utilize o método Collections.sort para ordená-la em ordem crescente.
Em seguida, imprima a lista ordenada.
 */

package Desafios_Listas.Numeros;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();

        listNumber.add(10);
        listNumber.add(500);
        listNumber.add(4);
        listNumber.add(1);
        listNumber.add(1004);
        listNumber.add(63);
        listNumber.add(5562);

        Collections.sort(listNumber);

        System.out.println("Lista de Números crescente (ordenada): " + "\n" + listNumber);
    }
}
