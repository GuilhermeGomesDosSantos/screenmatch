package Desafios.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel{

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }

    public void exibirInformacoesProduto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço Original: " + getPreco());
        System.out.printf("Preço Final: R$ %.2f ", calcularPrecoFinal());
        System.out.println();
    }
}
