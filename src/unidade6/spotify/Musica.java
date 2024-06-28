package unidade6.spotify;

public class Musica implements Midia {
    public void play(){
        System.out.println("Tocando música...");
    }

    public void pause(){
        System.out.println("Musica pausada...");
    }

    public void next(){
        System.out.println("Tocando próxima musica...");
    }

    public void previous(){
        System.out.println("Tocando música anterior...");
    }
}
