package unidade3.exemplos;

import java.util.Scanner;

public class ifElseifElse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) { // expressão condicional deve estar entre parenteses
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) { // && -> and
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é um(a) idoso(a).");
        }
        scanner.close();
    }
}
