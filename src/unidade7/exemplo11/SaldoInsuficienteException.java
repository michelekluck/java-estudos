package unidade7.exemplo11;

// exceção mais especifica
public class SaldoInsuficienteException extends ContaCorrenteException{
    public SaldoInsuficienteException(String message){
        super(message);
    }
}
