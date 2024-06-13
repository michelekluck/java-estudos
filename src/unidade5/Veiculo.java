package unidade5;

public class Veiculo {
    // atributos
    protected String marca;
    protected String motor;

    // construtor
    public Veiculo(String marcaDoVeiculo, String motorDoVeiculo) {
        this.marca = marcaDoVeiculo;
        this.motor = motorDoVeiculo;
    }

    // métodos
    public String getMarca() {
        return marca;
    }

    public String getMotor(){
        return motor;
    }
}
