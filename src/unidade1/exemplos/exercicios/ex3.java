package unidade1.exemplos.exercicios;
/* Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3 entre os números 0 e 30 usando a estrutura “do while”*/
public class ex3 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if ((numero % 3) == 0) {
             System.out.println(numero);
            } numero ++;
        } while (numero <= 30);

    }
    }

