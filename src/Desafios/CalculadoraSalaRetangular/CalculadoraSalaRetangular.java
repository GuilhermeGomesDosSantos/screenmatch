/*
Crie uma classe CalculadoraSalaRetangular que implementa uma
interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
A classe deve receber altura e largura como parâmetros.
 */

package Desafios.CalculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    double altura;
    double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area;
        area = getAltura() * getLargura();
        System.out.println("A Area de " + getLargura() + "(Altura) e " + getLargura() + "(Largura) é: " + area + " metros²");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = 2 * (getAltura() + getLargura());
        System.out.println("O perimetro de " + getAltura() + "(Altura) e " + getLargura() + "(Largura) é " + perimetro + "Metros");
    }
}
