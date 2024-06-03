package redeSocial2;

public class Usuario2 {
    static void curtirPostagem() { // não declaramos modificador de acesso, então é default(padrão)
        System.out.println("Usuário curtiu a portagem");
        Postagem2.mostrarCurtidas();;
        int x = Postagem2.curtidas;
        System.out.println("Curtidas antes  = " + x);
        Postagem2.curtidas++;
        System.out.println("Curtidas agora = " + Postagem2.curtidas);
    }
    public static void main(String args[]) {
        curtirPostagem();
    }
}
