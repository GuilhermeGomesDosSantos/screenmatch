package Desafios.CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        calculadoraSalaRetangular.setAltura(5);
        calculadoraSalaRetangular.setLargura(10);

        calculadoraSalaRetangular.calcularArea();
        calculadoraSalaRetangular.calcularPerimetro();
    }
}
