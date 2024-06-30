package unidade7.exemplo3;

public class contaCorrente {
    private double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public contaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        try {
            if (this.saldo - valor < 0) {
                throw new saldoInsuficienteException(String.format("Você esta tentando sacar R$ %.2f , mas você tem R$ %.2f na conta.", valor, this.saldo)); // "jogando" uma nova exceção
            }
        } catch (saldoInsuficienteException e) {
            System.out.println(e.getMessage());
            valor = 0;
        } finally {
            this.saldo -= valor; //this.saldo = this.saldo - valor;
        }

    }
}
