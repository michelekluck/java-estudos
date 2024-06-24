package unidade5;

import javax.sound.midi.SysexMessage;

public abstract class Veiculo {
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
    public abstract void getDetalhes();

    public void getSom(){
        System.out.println("Os veiculos podem ser bem barulhentos ou bem silenciosos. Depende do que você quer.");
    }
}
