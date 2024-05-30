package unidade3.exemplos;

import unidade3.exemplos.usuarios.Usuario;
import unidade3.exemplos.postagens.Postagem;

public class Main {
    public static void main(String args[]) {
        Usuario primeiroUsuario = new Usuario("Fulano");
        primeiroUsuario.mostrarPostagens();

        primeiroUsuario.criarPostagem();
        primeiroUsuario.mostrarPostagens();

        System.out.println(primeiroUsuario.getNome());

    }
}

