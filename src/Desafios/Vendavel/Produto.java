/*
Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
*/
package Desafios.Vendavel;

public class Produto implements Vendavel{
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

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        preco -= preco * (preco /100);
    }

    public void exibirInformacoesProduto() {
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("Preço do Produto '" + getNome() + "' é: " + getPreco());
    }
}
