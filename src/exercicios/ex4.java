package exercicios;
/*Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14). Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”*/

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) { // onde a execução do programa começa.
        Scanner scanner = new Scanner(System.in); // lê a entrada dp sistema

        System.out.print("Digite um numero inteiro: "); // exibe uma mensagem ao usuario
        int num = scanner.nextInt(); // le o numero digitado pelo usuario

        System.out.println("Tabuada de: " + num + ":"); // mensagem "tabuada de: "
        for (int i = 1; i <= 10; i++){ // loop que começa com i igual a 1 e incrementa i em cada 1 iteração até 'i' ser igual a 10
            int resultado = num * i; // calcula o produto do numero digitado (num) e o valor atual de i
            System.out.println(num + " x " + i + " = " + resultado); // imprime a multiplicação do numero pelo valor de i e o resultado correspondente
        }
        scanner.close();
    }
}
