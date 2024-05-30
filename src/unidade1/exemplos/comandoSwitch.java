package unidade3.exemplos;

// Em casos que se precisa testar diferentes valores de uma unica variavel
// Ou evitar a repetição de condições em cada teste do if/else
// switch é uma alternativa do if/else if/else

/*
crie um algoritmo em Java o qual informe ao usuário se um determinado número
é igual a 1, igual a 2, igual a 3, ou se o número é diferente de 1, 2 e 3.
*/

/* Usando else/else if/ else
public class comandoSwitch {
    public static void main(String[] args) {
        int numero = 3;

        if (numero == 1) {
            System.out.println("O numero é igual a 1");
        } else if (numero == 2) {
            System.out.println("O numero é igual a 2");
        } else if (numero == 3) {
            System.out.println("O numero é igual a 3");
        } else {
            System.out.println("O numero é diferente de 1, 2 e 3");
        }
    }
}
 */

// Usando swtich
// util quando existem muitos casos a serem verificador e o codigo precisa ser mais organizado
public class comandoSwitch {
    public static void main(String[] args){
        int numero = 3;

        switch (numero) {
            case 1:
                System.out.println("O numero é igual a 1");
                break;
            case 2:
                System.out.println("O numero é igual a 2");
                break;
            case 3:
                System.out.println("O numero é igual a 3");
                break;
            default:
                System.out.print("O numero é diferente de 1, 2 e 3");
                break;
        }
    }
}
