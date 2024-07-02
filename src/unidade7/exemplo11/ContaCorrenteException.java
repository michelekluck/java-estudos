package unidade7.exemplo11;

// exceção mais generica
public class ContaCorrenteException extends Exception{
    public ContaCorrenteException(String message){
        super(message);
    }
}
