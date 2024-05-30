package unidade3.exemplos;
/*
crie um código em Java o qual peça para que o usuário digite
um nome (tipo String), uma idade (tipo int) e uma altura (tipo float).
Armazene cada um desses dados em uma variável. Depois, mostre estes
dados na tela para o usuário.
*/

// esses imports importam as classes scanner e locale do pacote java,util
// usaremos algumas de suas funcionalidades para ler os dados digitados pelo usuario
import java.util.Scanner;
import java.util.Locale;

public class entradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR")); // definimos configurações regionais do codigo, seu uso é opcional
        Scanner scanner = new Scanner(System.in); // criamos um objeto scanner para ler os dados de entrada padrão
        // Scanner premite ler diferentes tipos de dados do usuario

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Realizamos a leitura de uma linha de texto digitada pelo usuario e atribuiamos a varivel nome

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Realizamos a leitura de um numero inteiro digitado pelo usuario e atribuimos a variavel idade

        System.out.print("Digite sua altura: "); // é preciso digitar a altura com , e nao . pois está em portugues
        float altura = scanner.nextFloat(); // realizamos a leitura de um numero de ponto flutuante (float) digitado pelo usuario e atribuimos a variavel altura

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        scanner.close(); // fechamos o objeto Scanner para liberar os recursos utilizados para a leitura de dados
    }
}
