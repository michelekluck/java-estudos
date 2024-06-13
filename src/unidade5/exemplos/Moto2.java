package unidade5.exemplos;

public class Moto2 {
    private String marca;
    private String motor;
    private int cilindradas;

    public Moto2(String marca, String motor, int cilindradas){
        this.marca = marca;
        this.motor = motor;
        this.cilindradas = cilindradas;
    }

    public String getMarca(){
        return marca;
    }

    public String getMotor(){
        return motor;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public String imprimir(){
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " de " + getCilindradas() + " cilindradas.";
    }
}
