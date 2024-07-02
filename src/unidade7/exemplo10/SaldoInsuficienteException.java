package unidade7.exemplo10;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg){ // fazemos o método construtor para repassar a mensagem de erro
        super(msg);
    }
}
