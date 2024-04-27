package Desafios.Vendavel;

public class Servico implements Vendavel{

    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }


    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora = precoHora - precoHora * (percentualDesconto / 100);
    }

    public void exibirInformacoesServico() {
        System.out.println("Descrição do Serviço: " + getDescricao());
        System.out.printf("Preço hora / serviço: R$ %.2f", getPrecoHora());
    }
}
