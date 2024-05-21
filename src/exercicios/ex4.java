package exercicios;
/*Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14). Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”*/

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada de: " + num + ":");
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
