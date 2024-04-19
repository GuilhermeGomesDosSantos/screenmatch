package Desafios.Musica;

public class Main {
    public static void main(String[] args) {
        Musica music = new Musica();
        music.titulo = "Passado e Presente";
        music.artista = "MC Kevin";
        music.anoLancamento = 2020;

        music.avaliarMusica(9);
        music.avaliarMusica(4.6);
        music.avaliarMusica(7.3);
        music.avaliarMusica(8);

        music.calcMediaMusica();

        music.infoMusica();
    }
}
