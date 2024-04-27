package Desafios.Vendavel;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------VENDAS----------");

        Produto produto = new Produto();

        produto.setNome("Produto Teste");
        produto.setPreco(10);
        produto.calcularPrecoTotal(3);
        produto.aplicarDesconto(10);
        produto.exibirInformacoesProduto();
        System.out.println("\n------------------------");

        System.out.println("----------SERVIÇO----------");
        Servico servico = new Servico();
        servico.setDescricao("Teste");
        servico.setPrecoHora(50);
        servico.aplicarDesconto(10);
        servico.exibirInformacoesServico();
    }
}
