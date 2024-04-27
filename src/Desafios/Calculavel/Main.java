/*
Crie uma interface Calculavel com um método double calcularPrecoFinal().
Implemente essa interface nas classes Livro e ProdutoFisico,
cada uma retornando o preço final considerando descontos ou taxas adicionais.
*/

package Desafios.Calculavel;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Venda de Produtos-----");

        System.out.println("Venda de Livros");
        Livro livro = new Livro();
        livro.setNome("Livro teste");
        livro.setAno("2024");
        livro.setAutor("Guilherme");
        livro.setPreco(10.6);
        livro.calcularPrecoFinal();
        livro.exibirInformacoesLivro();
        System.out.println("\n--------------------------");

        System.out.println("Venda de Produtos Físicos");
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setNome("Carne");
        produtoFisico.setPreco(45.00);
        produtoFisico.calcularPrecoFinal();
        produtoFisico.exibirInformacoesProduto();
    }
}
