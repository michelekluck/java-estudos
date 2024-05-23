package unidade1.exemplos.exercicios;
/* Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.*/

import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Digite um numero inteiro, positivo ou negativo: ");
      int numero = scanner.nextInt();

      if(numero>0) {
          System.out.println("O numero digitado é inteiro.");
      } else if(numero==0){
          System.out.println("O numero digitado é 0");
        } else {
          System.out.println("O numero digitado é negativo");
      }

    }

}
