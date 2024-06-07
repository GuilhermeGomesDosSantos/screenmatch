package Desafios_Listas.Area;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
