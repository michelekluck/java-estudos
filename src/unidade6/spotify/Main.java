package unidade6.spotify;

public class Main {
    public static void main(String[] args){
        Midia musica = new Musica();
        musica.play();
        musica.pause();
        musica.next();
        musica.previous();

        Midia podcast = new Podcast();
        podcast.play();
        podcast.pause();
        podcast.next();
        podcast.previous();
    }
}
