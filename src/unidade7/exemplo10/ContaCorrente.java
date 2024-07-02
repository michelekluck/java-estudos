package unidade7.exemplo10;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (saldo - valor <= 0){ // testamos se o saldo é suficieinte para saque para evitar saques se a pessoa nao possui dinheiro suficiente
            throw new SaldoInsuficienteException(String.format("O saldo %.2f é insuficiente para sacar o valor %.2f", saldo, valor));
            // se o saldo nao for suficiente, criamos a exceção e a disparamos com o throw
            // throws + nome da exceção -> meotod dispara a exceção verificada e que ela deve ser obrigatoriamente  tratada
        }
        this.saldo -= valor;
    }

    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente(100);

        try{
            conta.sacar(200); // ao chamar o método sacar, preciamos adicionar um bloc try.. catch que capture e trate e exceção, impedindo que ela se propague
        } catch(SaldoInsuficienteException e){
            System.out.println("Deu um erro, hein");
        }
    }
}
