package unidade5;

import javax.sound.midi.SysexMessage;

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

    // override
    public void getDetalhes(){
        System.out.println("A marca do veiculo é " + getMarca() + ", e o motor é " + getMotor());
    }

    public void getSom(){
        System.out.println("Os veiculos podem ser bem barulhentos ou bem silenciosos. Depende do que você quer.");
    }
}
