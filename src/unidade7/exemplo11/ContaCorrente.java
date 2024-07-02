package unidade7.exemplo11;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    // declaração do método retirar, que pode lançar uma exceção mais generica: ContaCorrenteExceptiong
    public void retirar(double valor) throws ContaCorrenteException{
        // em erro especifico, lança exceção espeficiada: SaldoInsuficienteException, filha de ContaCorrenteException
        if (saldo - valor  <= 0)
            throw new SaldoInsuficienteException(String.format("O saldo R$ %.2f é insuficiente para sacar o valor R$ %.2f", saldo, valor));
        // SaldoInfuciente é herdeira de ContaCorrenteException, o método retirar() pode lançar uma exceção mais generica (ContaCorrenteException)
        // porém, quando há um erro especificp, o metodo pode lançar uma exceção especifica, herdeira de ContaCorrenteException, nesse caso é o SaldoInsuficienteException
        else
            this.saldo -= valor;
    }

    public double getSaldo(){
        return saldo;
    }
}
