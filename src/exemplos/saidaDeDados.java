package exemplos;
/* crie um código em Java o qual mostre na tela o nome,
idade e altura de uma pessoa. Estas três informações deverão ficar
armazenadas em três variáveis.*/
public class saidaDeDados {
    public static void main(String[] args) {
        // variaveis com diferentes tipos de dados
        String nome = "Rafaela";
        int idade = 32;
        double altura = 1.65;

        // Exemplo 1: uso do System.out.println para exibir dados
        // concatena textos e o conteudo das variaveis com o operador +
        // println adiciona automaticamente uma quebra de linha ao final de cada texto mostrado na tela
        System.out.println("Exemplo 1:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome + ", Altura: " + altura);

        // Exemplo 2: Uso do System.out.print para exibir dados
        // concatena textos e conteudo das variaveis com operador +
        // o print mostra exatamente o que gostariamos mas nao adicona nenhuma quebra de linha automaticamente
        // \n ao final de cada linha é para que aconteça a quebra de linha opcionalmente
        System.out.print("\nExemplo 2:\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("Idade: " + idade + "\n");
        System.out.print("Altura: " + altura + "\n");
        System.out.print("Nome: " + nome + ", Altura: " + altura + "\n" );

        // Exemplo 3: Uso do SYstem.out.printf para formatar e exibir dados:
        // usamos os marcadores %s $d %.2f para excibir os dados formatados das variaveis
        // o f no final de printf é de formatação
        System.out.println("\nExemplo 3:");
        System.out.printf("Nome: %s\n", nome ); // %s indica uma string
        System.out.printf("Idade: %d\n", idade); // %d indica numero inteiro
        System.out.printf("Altura: %.2f\n", altura); //%.2f indica um numero de ponto flutuante com duas casas decimais
        System.out.printf("Nome: %s, Altura: %.2f\n", nome, altura);
        System.out.println();

        // Exemplo 4: Uso do System.out.format para formatar e exibir dados:
        // formet é muito parecido com o printf
        System.out.println("\nExemplo 4:");
        System.out.format("Nome: %s\n", nome);
        System.out.format("Idade: %d\n", idade);
        System.out.format("Altura: %.2f\n", altura);
        System.out.format("Nome: %s, Altura: %.2f\n", nome, altura);
        System.out.println();

        //Exemplo 5: Uso do StringBuilder parea constuir a mensagem:
        // concatena as strings com metodo append
        // o append funciona como o append nas lista de python, a diferença é que construimos uma string e nao uma lista
        System.out.println("\nExemplo 5: ");
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Nome: ").append(nome).append("\n");
        mensagem.append("Idade: ").append(idade).append("\n");
        mensagem.append("Altura: ").append(altura).append("\n");
        mensagem.append("Nome: ").append(nome).append(", Altura: ").append(altura).append("\n");
        System.out.println(mensagem);
    }
}
