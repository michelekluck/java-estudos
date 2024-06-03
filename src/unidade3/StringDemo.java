package unidade3;

public class StringDemo {
    public static void main(String[] args) {
        String ola = "Olá"; // declara e instancia diretamentte

        // instancia com new
        String nome1 = new String("Maria");
        String nome2 = new String("João");

        // Declara e instancia com a concatenação de strings
        String saudacao = ola + ", " + nome1 + "!\n\n";
        System.out.println(saudacao);

        // altera o valor de saudacao pela atribuição do valor ola
        // não é preciso declarar saudacao novamente
        saudacao = ola;

        // altera o valor de saudacao, que recebe o resultado daq concatenação de mais strings
        // é uma alternativa que utiliza o método String.concat(String s):
        saudacao = saudacao.concat(", " + nome2);
        saudacao = saudacao.concat("!\n\n");

        // mais uma alternativa de concatenação
        System.out.println(saudacao + "fim");
    }
}
