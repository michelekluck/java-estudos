package unidade5.exemplos.exemplo1;

public class Veiculo2 {
    protected String marca;
    String motor;

    public Veiculo2(String marca, String motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public String imprimir(){
        return "Marca: " + getMarca() + ", Motor: " + getMotor();
    }
}
