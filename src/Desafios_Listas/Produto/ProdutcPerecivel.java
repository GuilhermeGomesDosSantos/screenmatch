package Desafios_Listas.Produto;

public class ProdutcPerecivel extends Product {
    String dataValidade;
    public ProdutcPerecivel (String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Validade = " + getDataValidade() + " ]";
    }
//    public static void main(String[] args) {
//        ProdutcPerecivel produtcPerecivel = new ProdutcPerecivel("Salgadinho", 12.5, 2, "16/10/2025");
//        System.out.println(produtcPerecivel);
//    }
}
