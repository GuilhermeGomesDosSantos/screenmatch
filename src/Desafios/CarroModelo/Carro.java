/*
Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
 */

package Desafios.CarroModelo;

public class Carro {
    private String modelo;

    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo (String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco (double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }


    public void exibeInformacao() {
        ModeloCarro modeloCarro = new ModeloCarro();

        System.out.println("Modelo: " + modelo);
        System.out.println("Preço ano 1 - " + precoAno1);
        System.out.println("Preço ano 2 - " + precoAno2);
        System.out.println("Preço ano 3 - " + precoAno3);
        System.out.println("Maior Preço: " + maiorPreco());
        System.out.println("Menor Preço: " + menorPreco());
    }


    private double menorPreco () {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        } else if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double maiorPreco () {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        } else if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}
