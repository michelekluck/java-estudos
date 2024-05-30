package unidade3.exemplos.usuarios;

import unidade3.exemplos.postagens.Postagem;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // atributos
    private String nome;
    private List<Postagem> listaPostagens = new ArrayList<Postagem>();

    public String getNome(){
        return this.nome;
    }

    public List<Postagem> getListaPostagens() {
        return this.listaPostagens;
    }

    // construtor
    public Usuario(String nomeDoUsuario) {
        this.nome = nomeDoUsuario;
        this.listaPostagens = new ArrayList<Postagem>();
    }

    // métodos
    public boolean criarPostagem() {
        listaPostagens.add(new Postagem());
        return true;
    }

    public void mostrarPostagens() {
        if (listaPostagens.isEmpty()) {
            System.out.println("Lista de postagens vazia.");
            return;
        }
        for (Postagem postagem : listaPostagens){
            // postagem.curtidas = 1000000000;
            postagem.setCurtidas(-100000);
            postagem.mostrarCurtidas();
        }

    }

    public void curtirPostagem(Postagem postagemAleatoria) {
        System.out.println("Usuário curtiu a postagem");
        postagemAleatoria.adicionarCurtida();
        postagemAleatoria.mostrarCurtidas();
    }
}
