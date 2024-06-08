package Desafios_Listas.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> listTitle = new ArrayList<>();

        listTitle.add(new Titulo("Z"));
        listTitle.add(new Titulo("T"));
        listTitle.add(new Titulo("H"));
        listTitle.add(new Titulo("G"));
        listTitle.add(new Titulo("A"));

        Collections.sort(listTitle);

        System.out.println("Lista ordenada de Titulos: ");

        for (Titulo title : listTitle) {
            System.out.println(title.nome);
        }
    }
}
