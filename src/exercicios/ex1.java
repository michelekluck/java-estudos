package exercicios;
/*Crie um algoritmo em Java que solicita três números decimais ao usuário. Em seguida, a média destes números é calculada e mostrada na tela para o usuário.*/

import java.util.Scanner;
import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float num2 = scanner.nextFloat();


        System.out.print("Digite o terceiro numero: ");
        float num3 = scanner.nextFloat();

        float media = num1 + num2 + num3 / 3;
        System.out.printf("Média dos numeros: " + media);

        scanner.close();
    }
}
