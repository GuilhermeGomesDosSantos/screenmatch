/*
1 - Crie uma classe Animal e uma classe Cachorro que herda de Animal.
Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

2 - Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida,
crie um objeto da classe Cachorro e faça o casting para a classe Animal.

3 - Modifique o Exercício 2 para incluir uma verificação usando instanceof
para garantir que o objeto seja do tipo correto antes de fazer o casting.
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