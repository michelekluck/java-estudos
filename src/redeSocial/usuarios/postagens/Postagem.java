package redeSocial.usuarios.postagens;

public class Postagem {
    // atributos
    private int curtidas;

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas( int novaQuantidadeDeCurtidas) {
        this.curtidas = Postagem.validarNumeroCurtidas(novaQuantidadeDeCurtidas);
    }

    // construtor
    public Postagem () {
        this.curtidas = 0;
    }

    // metodos
    public void mostrarCurtidas() {
        System.out.println("Total de curtidas: " + curtidas);
    }

    public void adicionarCurtida() {
        curtidas += 1;
    }

    private static int validarNumeroCurtidas(int quantidadeParaValidar) {
        if (quantidadeParaValidar < 0) {
            System.out.println("Numero de curtidas inválido: não pode ser negativo.");
            return 0;
        }
        return quantidadeParaValidar;
    }
}