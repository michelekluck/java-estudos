package redeSocial.usuarios;

public class Main {
    public static void main(String args[]) {
        Usuario primeiroUsuario = new Usuario("Fulano");
        primeiroUsuario.mostrarPostagens();

        primeiroUsuario.criarPostagem();
        primeiroUsuario.mostrarPostagens();

        System.out.println(primeiroUsuario.getNome());

    }
}

