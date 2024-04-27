/*
Desenvolva uma classe Livro com os atributos privados titulo e autor.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método exibirDetalhes que imprime o título e o autor do livro.
*/

package Desafios.Calculavel;

public class Livro extends Produto implements Calculavel{
    private String ano;
    private String autor;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }

    public void exibirInformacoesLivro() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano: " + getAno());
        System.out.println("Autor(a): " + getAutor());
        System.out.println("Preço Original: " + getPreco());
        System.out.printf("Preço Final: R$ %.2f ", calcularPrecoFinal());
    }

}
