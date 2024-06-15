package unidade5.exemplos;

public class Moto2 extends Veiculo2 {
    private int cilindradas;

    public Moto2(String marca, String motor, int cilindradas){
        super(marca, motor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public String imprimir(){
        return "Marca: " + marca + ", Motor: " + motor + " de " + cilindradas + " cilindradas.";
    }
}
