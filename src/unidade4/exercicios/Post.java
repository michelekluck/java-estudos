package unidade4.exercicios;
import java.util.ArrayList;
/*Crie uma classe post com atributos para "texto", "quantidadeDeCurtidas" e
"quantidadeDeCompartilhamentos". Em seguida, crie uma classe usuario que contém um ArrayList
 de post para representar o feed de notícias do usuário.*/

public class Post {
    // atributos
    private String texto;
    private int quantidadeDeCurtidas;
    private int quantidadeDeCompartilhamentos;

    // construtor
    public Post(String texto) {
        this.texto = texto;
        this.quantidadeDeCurtidas = 0;
        this.quantidadeDeCompartilhamentos = 0;
    }

    public void curtir() {
        this.quantidadeDeCurtidas++;
    }

    public void compartilhar(){
        this.quantidadeDeCompartilhamentos++;
    }

    public String toString(){
        return "Post: " + texto + "\nCurtidas: " + quantidadeDeCurtidas + "\nCompartilhamentos: " + quantidadeDeCompartilhamentos;
    }
}

class Usuario {
    private ArrayList<Post> feedNoticias;

    public Usuario() {
        this.feedNoticias = new ArrayList<Post>();
    }

    public void postar(String texto) {
        Post novoPost = new Post(texto);
        this.feedNoticias.add(novoPost);
    }

    public void curtirPost(int index) {
        if (index >= 0 && index < feedNoticias.size()) {
            feedNoticias.get(index).curtir();
        }
    }

    public void compartilharPost(int index) {
        if(index >= 0 && index < feedNoticias.size()) {
            feedNoticias.get(index).compartilhar();
        }
    }

    public void imprimirFeed(){
        for (Post post : feedNoticias) {
            System.out.println(post);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Usuario usuario = new Usuario();
        usuario.postar("Primeiro post!");
        usuario.postar("Outro post interessante");
        usuario.postar("Gosto muito quando o codigo finalmente funciona!");

        usuario.curtirPost(0);
        usuario.compartilharPost(1);

        usuario.imprimirFeed();

    }
}
