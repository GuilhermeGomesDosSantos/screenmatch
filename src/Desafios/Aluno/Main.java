/*
Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno,
atribua valores aos seus atributos e utilize o método para exibir as informações.
 */

package Desafios.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Guilherme";
        aluno.idade = 21;

        aluno.informacaoAluno();
    }
}
