package redeSocial2;

public class Postagem2 {
    // curtidas não tem valor declarado, então é 0 (zero)
    static int curtidas; // não declaramos modificador de acesso, então é default(padrão)

    static void mostrarCurtidas() { // não declaramos modificador de acesso, então é default(padrão)
        System.out.println("-----------------------");
        System.out.println("...Postagem recebeu curtida!");
        System.out.println("...Total de curtidas = " + curtidas);
        System.out.println("------------------------");
    }
}
