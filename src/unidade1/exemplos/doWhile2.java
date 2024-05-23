package unidade1.exemplos;

// O Java garante que o bloco de codigo seja executado pelo menos uma vez, mesmo se a condição for falsa desde o inicio
public class doWhile2 {
    public static void main(String[] args){
        int numero = 0;
// primeiro executa o bloco de codigo de dentro do do
        do {
            System.out.println("Numero: " + numero);
            numero++;
// verifica a condição do while
// enquanto a condição numero < 5 for verdadeira o loop continuará executando
        } while (numero < 5);
    }
}
