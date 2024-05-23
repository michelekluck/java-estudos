package exemplos;

// usado para os casos em que precisamos interromper um comando de repetição
// continue: interrompe a repetição e executa a condição novamente
// break: interrompe a repetição incondicionalmente

/*crie dois loops usando Java. O primeiro deve usar “break”, e
o segundo, “continue”.*/

public class continueBreak {
    public static void main(String[] args) {
        // Exemplo de uso Break
        System.out.println("Exemplo com break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // encerra o loop quando i == 3
            }
            System.out.println("Número: " + i);
        }
        System.out.println();

        // Exemplo de uso do continue
        System.out.println("Exemplo com continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; //pula para a proxima iteração
            }
        System.out.println("Número: " + i);
        }
    }
}
