package Desafios.Produto;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();

        prod.setNome("Camiseta");
        prod.setPreco(1000);

        System.out.println("Nome do produto: " + prod.getNome());
        System.out.println("Preço do produto (" + prod.getNome() + ") : R$" + prod.getPreco());

        prod.aplicarDesconto(10);

        System.out.println("Novo Preço após Desconto: " + prod.getPreco());
    }
}
