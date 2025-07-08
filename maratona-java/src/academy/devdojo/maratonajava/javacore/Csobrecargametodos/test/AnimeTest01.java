package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("Kimetsu no Yaiba");
//        anime.setTipo("Shonnen");
//        anime.setEpisodios(12);
//        anime.init("Kimetsu no Yaiba", "Shonnen", 12);
        anime.init("Kimetsu no Yaiba", "Shonnen", "Fantasia", 12);
        anime.imprime();
    }
}
