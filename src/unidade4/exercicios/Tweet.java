package unidade4.exercicios;
/*Crie uma classe tweet com atributos para "texto", "usuario" e "retweets".
Em seguida, crie uma classe usuario que contém um ArrayList de tweet para representar
os tweets de um usuário. Crie métodos para postar um novo tweet e para retweetar um tweet existente.*/

import java.util.ArrayList;

public class Tweet {
    private String texto;
    private String usuario;
    private int retweets;

    public Tweet(String texto, String usuario) {
        this.texto = texto;
        this.usuario = usuario;
        this.retweets = 0;
    }

    public String getTexto(){
        return texto;
    }

    public String getUsuario(){
        return usuario;
    }

    public int getRetweets(){
        return retweets;
    }

    public void retweet(){
        this.retweets += 1;
    }
}

class UsuarioTwitter {
    private String nome;
    private ArrayList<Tweet> tweets;

    public UsuarioTwitter(String nome){
        this.nome = nome;
        this.tweets = new ArrayList<Tweet>();
    }

    public void postarTweet(String texto){
        Tweet tweet = new Tweet(texto, this.nome);
        tweets.add(tweet);
    }

    public void retweetar(Tweet tweet){
        tweet.retweet();
    }

    private void listarTweets () {
        for(Tweet tweet: tweets){
            System.out.println("Tweet de " + tweet.getUsuario() + ": " + tweet.getTexto() + " - Retweets: " + tweet.getRetweets() );
        }
    }

}
