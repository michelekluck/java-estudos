package unidade5.exemplos.exemplo1;

public class Onibus extends Veiculo2 {
    private int passageiros;
    private boolean articulado;

    public Onibus(String marca, String motor, int passageiros, boolean articulado){
        super(marca, motor);
        this.passageiros = passageiros;
        this.articulado = articulado;
    }

    public int getPassageiros(){
        return passageiros;
    }

    public boolean isArticulado(){
        return articulado;
    }

    public String imprimir(){
        return "Marca: " + getMarca() + ", Motor: " + getMotor() + " Passageiros: " + getPassageiros() + " Articulado: " + (isArticulado() ? "sim" : "não");
    }
}
