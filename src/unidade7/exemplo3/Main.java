package unidade7.exemplo3;

public class Main {
    public static void main(String[] args) {
        contaCorrente contaExemplo = new contaCorrente(1000);
        System.out.println("O saldo atual é de R$ " + contaExemplo.getSaldo());

        // vamos sacar 800
        try {
            contaExemplo.sacar(800);
            System.out.println("O saldo atual é de R$ " + contaExemplo.getSaldo());

        } catch (saldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            // vamos sacar 200
            contaExemplo.sacar(200);
            System.out.println("O saldo atual é de R$ " + contaExemplo.getSaldo());
        } catch (saldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            // vamos sacar 1000000
            contaExemplo.sacar(1000000);
            System.out.println("O saldo atual é de R$ " + contaExemplo.getSaldo());
        } catch (saldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
