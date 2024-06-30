package unidade7.exemplo3;

public class saldoInsuficienteException extends Exception{
    public saldoInsuficienteException(String msg){
        super(msg); // mensagem de erro
    }
}

