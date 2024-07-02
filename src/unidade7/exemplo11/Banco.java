package unidade7.exemplo11;

public class Banco {
    // metodo sacar DELEGA o tratamento de exceções generica (ContaCorrenteException) pois nao fara seu tratamento
    // esse meotod sacar é static pois nao pode ser chamado sem criar uma instancia da classe 'Banco'
    // ele recebe uma instancia de 'ContaCorrente' ('c') e um valor ('valor')
    private static void sacar(ContaCorrente c, double valor) throws ContaCorrenteException{
        c.retirar(valor);   // o metodo chama o metodo 'retirar' da instancia 'c', que pode lançar uma exceção do tipo 'ContaCorrenteException'
    }

    public static void main(String[] args){
        ContaCorrente cta = new ContaCorrente(1000); // criação da instancia 'ContaCorrente' com um saldo inicial de 1000

        // é obrigatorio os comndos try-catch pois os métodos retirar() e sacar() lançam excelçao verificada em tempo de compilação
        try {
            sacar(cta, 200); // metodo 'sacar' é chamado com 'cta' e '200' como argumentos
            // o metodo sacar() chama o método retirar(), o que obrigada o sacar() a tratar try-catch
        } catch(ContaCorrenteException e){ // se 'retirar' lançar uma exceção 'ContaCorenteException', ela será capturada no 'catch' e a mensagem de erro será impressa
            System.out.println("Erro: " + e.getMessage());
            // nesse caso nao foi gerada nem lançada a exceção, pois o saldo 1000 é suficiente para retirar 200
        } finally {
            System.out.println("Saldo Conta: R$ " + cta.getSaldo());
            // valor impresso: 800 -> 1000-800
        }

        try {
            cta.retirar(2000);
        } catch (ContaCorrenteException e){
            System.out.println(e.getMessage());
            // memso sendo catch ContaCorrenteException, a exceção trata de fato é a SaldoInsuficienteException, herdeira de ContaCorrenteExpcetion, lançada pelo método retirar()
        } finally {
            System.out.println("Saldo Conta: R$ " + cta.getSaldo());
            // valor impresso : 800 -> pois nao foi possivel retirar 2000, então o saldo ficou igual amtes.
        }
    }
}
