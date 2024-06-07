/*
Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
 */

package Desafios_Listas.Produto;

public class Product {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private int quantidade;

    public Product (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
