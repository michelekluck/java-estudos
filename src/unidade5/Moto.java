package unidade5;

// moto é subclasse de veiculo
// veiculo é uma superclasse partir de caminhão e de moto
// moto é uma especialização de veiculo
public class Moto extends Veiculo{
    // atributos
    private  int cilindradas;

    // construtor
    public Moto(String marcaDaMoto, String motorDaMoto, int cilindradas){
        super(marcaDaMoto, motorDaMoto);
        this.cilindradas = cilindradas;
    }

    // metodos
    public int getCilindradas(){
        return this.cilindradas;
    }
}
