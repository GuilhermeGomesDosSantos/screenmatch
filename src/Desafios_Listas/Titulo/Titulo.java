/*
2 - Crie uma classe Titulo com um atributo nome do tipo String.
Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

3 - No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
*/

package Desafios_Listas.Titulo;
public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}