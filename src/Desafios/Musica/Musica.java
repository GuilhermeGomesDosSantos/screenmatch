/*
Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
 */

package Desafios.Musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int totalDeAvaliacao;

    void infoMusica() {
        System.out.println("Titúlo da Musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento da Múscia: " + titulo + ": " + anoLancamento);
        System.out.println("Média das avaliações: " + calcMediaMusica());
    }

    void avaliarMusica (double nota) {
        avaliacao += nota;
        totalDeAvaliacao++;
    };

    double calcMediaMusica () {
        return avaliacao / totalDeAvaliacao;
    }
}
