package unidade6.spotify;

public class Podcast implements Midia {
    public void play(){
        System.out.println("Tocando podcast...");
    }

    public void pause(){
        System.out.println("Podcast pausada...");
    }

    public void next(){
        System.out.println("Tocando próximo podcast...");
    }

    public void previous(){
        System.out.println("Tocando podcast anterior...");
    }
}
