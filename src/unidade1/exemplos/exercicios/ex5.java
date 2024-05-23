package unidade1.exemplos.exercicios;
/* Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032). Em seguida, o algoritmo deve verificar se o ano informado é ou não bissexto*/

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: "); // exibe mensagem ao usuario
        int ano = scanner.nextInt(); // le a mensagem do usuario

        boolean bissexto = false; // inicializa uma variavel booleana chamada 'bissexto' como 'false'.essa variavel sera usada para indicar se o ano é bissexto
        if (ano % 4 == 0) { // verifica se o ano é divisivel por 4. se for, pode ser um ano bissexto, então entramos no bloco if
            if (ano % 100 == 0) { //vefifica se o ano é divisivel por 100. se for, precisamos de mais uma verificação, pois anos multiplos de 100 so sao bissextos se forem multiplos de 400
                if (ano % 400 == 0) { // se o ano é divisivel por 400, é um ano bissexto e 'bissexto' é denifinido como 'true'
                    bissexto = true;
                } else {
                    bissexto = false;
                }
            } else {
                bissexto = true;
            }
        }
            if (bissexto) {
                System.out.println("O ano é bissexto.");
            } else {
                System.out.println("O ano não é bissexto.");
            }
            scanner.close();
        }
    }

