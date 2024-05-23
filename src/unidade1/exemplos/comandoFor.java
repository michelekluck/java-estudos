package unidade1.exemplos;
// mostrar uma sequencia de numero de 0 a 9

public class comandoFor {
    public static void main(String[] args) {
        for (int i =0; i < 10; i++) { // inicializamos a variavel i com 1, definimos a condição de parada com i < 6, e incrementamos i em cada iteração
            System.out.println("Numero: " + i); // dentro do loop imprimimos a mensagem desejada
        }
    }
}

// ordem da instrução for:
// 1. inicialização: permite a criação e inicialização de variaveis
// 2. condição: mantem o for repetindo seu bloco de comandos enquanto verdadeira
// 3. operação: executada ao final de cada iteração (repetição) do for

// i ++ é a mesma coisa que i= i + 1
