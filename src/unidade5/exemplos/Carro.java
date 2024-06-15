package unidade5.exemplos;

public class Carro extends Veiculo2{ // extends = indica que a classe carro "estende" (é uma subclasse de) veiculo2
    private int portaMalas;

    public Carro(String marca, String motor, int portaMalas){
        super(marca, motor); // chama o construtor da superclasse
        // util quando a superclasse tem um construtor com parametros que precisam ser inicializados
        this.portaMalas = portaMalas;
    }

    public int getPortaMalas(){
        return portaMalas;
    }

    public String imprimir() {
        return "Marca: " + this.marca + ", Motor: " + this.motor + " Porta-malas: " + this.portaMalas + " litros.";
    }
}

