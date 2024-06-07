package Desafios_Listas.ProdutoLista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProdutoLista product_1 = new ProdutoLista("Celular 123", 2050.65);
        ProdutoLista product_2 = new ProdutoLista("Fone Bluetooth", 199.95);
        ProdutoLista product_3 = new ProdutoLista("Camisa Longa", 157.25);

        ArrayList<ProdutoLista> product = new ArrayList<>();

        product.add(product_1);
        product.add(product_2);
        product.add(product_3);

        double total = 0;

        System.out.println("Lista de Produtos:");
        for (ProdutoLista produtoList : product) {

            System.out.println("Produto: " + produtoList.getNome() + ", Preço: " + produtoList.getPreco());
        }

        for (int i = 0; i < product.size(); i++) {
            total += product.get(i).getPreco() / (product.size());
        }
        System.out.printf("O preço médio dos %d Produtos é: R$ %.2f%n",product.size(), total);
    }

}
