package Desafios.AlunoNew;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Guilherme");
        aluno.setNota1(6);
        aluno.setNota2(5);
        aluno.setNota3(9);
        System.out.println("A média do aluno: " + aluno.getNome() + " é: " + aluno.calcularMedia());
    }
}
