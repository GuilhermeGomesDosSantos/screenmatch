/*
4 - Crie uma classe Produto com propriedades como nome e preço.
Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
 */

package Desafios_Listas.ProdutoLista;

public class ProdutoLista {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public ProdutoLista(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}