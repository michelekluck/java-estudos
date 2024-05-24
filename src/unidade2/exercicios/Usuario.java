package unidade2.exercicios;
/* Desenvolva um projeto em Java contendo somente um arquivo: Usuario.java. Esse arquivo deve conter uma
 classe chamada Usuario, que representa um usuário da Netflix. Essa classe precisa de três atributos
 (nome do usuário, e-mail e senha), somente*/

/*contenha dois métodos (um para mostrar na tela o nome e e-mail do usuário, e outro para verificar
se uma determinada senha informada é igual à senha cadastrada pelo usuário). Além disso, inclua um método
construtor para aceitar três parâmetros: o e-mail, a senha e o nome do usuário*/

public class Usuario { // declara uma classe chamada Usuario
    // essa classe tem tres atributos (caracteristicas):
    String nome;
    String email;
    String senha;

    Usuario(String nome, String email, String senha) { // metodo construtor padrão
        // contem tres parametros
        this.nome = nome; // this.nome = refere-se ao atributo da classe e nome = refere-se ao parametro do método
        this.email = email;
        this.senha = senha;
    }

    void imprimirInfo(){ // método "void" significa que o método não retorna nenhum valor
        System.out.println("Nome: " + this.nome);  // 'this' refere-se ao objeto atual da classe
        System.out.println("Email: " + this.email);
    }

    boolean verificarSenha(String senhaFornecida) { // método "boolean" retorna true or false e tem como parametro 'senhaFornecida' do tipo String
        return this.senha.equals(senhaFornecida);
        // return -> indica que o metodo deve retornar um valor
        // 'this' -> objeto atual da classe
        // equals -> é um metodo da classe "String" que é usado para comparar o atributo 'senha' com o valor do parametro 'senhaFornecida'
        // quando o método 'verificarSenha' é chamado, o valor passado como argumento é atribuido a este parametro. este valor é a senha que está sendo verificada
        // o método compara a senha armazenada no objeto 'this.senha' coma  senha fornecida 'senhaFornecida'
        // se as duas senhas são iguais, o metodo retorna 'true', caso contrario, retorna 'false'
    }

    public static void main(String [] args){
        Usuario usuario = new Usuario("João", "joao@exemplo.com", "senhaSegura123");
        // declaramos a variavel chamada 'usuario' do tipo 'Usuario'
        // esta variavel sera usada para armazenar a referencia a um objeto do tipo 'Usuario'
        // 'new Usuario' -> cria um novo objeto da classe 'Usuario'
        // 'new' -> usada para instanciar um novo objeto
        // 'Usuario(...)' -> chama o construtor da classe 'Usuario' e passa tres argumentos para ele
        // esses argumentos são usados para inicializar os atributos do objeto 'Usuario'

        usuario.imprimirInfo();
        // chama o método 'imprimirInfo' no objeto referenciado pela variavel 'usuario'
        // esse metodo imprime os valores dos atributos 'nome' e 'email' do objeto 'usuario' no console

        boolean senhaCorreta = usuario.verificarSenha("senhaSegura123");
        // criamos uma variavel 'senhaCorreta' e nela chamamos o método 'verificarSenha' do objeto 'usuario' e atribuimos como parametro uma senha

        System.out.println("Senha fornecida está correta? " + senhaCorreta);
        // aqui imprimimos na tela "Senha fornecida está correta?" e como resposta teremos true or false pois 'verificarSenha' é boolean
        // o resultado será true pois a senha fornecida em senhaCorreta é igual a senha fornecida como parametro no objeto 'usuario'.

        boolean senhaIncorreta = usuario.verificarSenha("senhaSegura000");
        System.out.println("Senha fornecida está correta? " + senhaIncorreta);
        // aqui o resultado será false pois
    }

}
