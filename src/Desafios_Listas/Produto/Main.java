package Desafios_Listas.Produto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> listProducts = new ArrayList<>();

        Product product_1 = new Product("Uva", 15.0, 5);
        listProducts.add(product_1);

        Product product_2 = new Product("Arroz", 35.75, 2);
        listProducts.add(product_2);

        Product product_3 = new Product("Feijão", 20.5, 5);
        listProducts.add(product_3);

        System.out.println("O tamanho da lista de Produtos é: " + listProducts.size());

        System.out.println("No indice 2 temos o Produto: " + listProducts.get(2).getNome());
    }
}