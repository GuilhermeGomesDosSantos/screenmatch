/*
Crie uma classe Animal e uma classe Cachorro que herda de Animal.
Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
 */

package Desafios_Listas.Animal;

public class Animal {
    private String nome;

    public Animal (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazendoAcao() {
        System.out.println(getNome() + " está andando");
    }
}