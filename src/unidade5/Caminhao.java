package unidade5;

// caminhao é subclasse de veiculo
// veiculo é uma superclasse partir de caminhão e de moto
// caminhao é uma especialização de veiculo
public class Caminhao extends Veiculo{
    // atributos
    // coisas especificas para caminhões
    private int numeroEixos;
    private int capacidadeEmToneladas;

    // construtor
    public Caminhao (String marcaDoCaminhao, String motorDoCaminhao, int numeroEixosCaminhao, int capacidadeEmToneladas) {
        super(marcaDoCaminhao, motorDoCaminhao); // chame o construtor do veiculo
        this.marca = marcaDoCaminhao;
        this.numeroEixos = numeroEixosCaminhao;
        this.capacidadeEmToneladas = capacidadeEmToneladas;
    }

    public int getNumeroEixos(){
        return this.numeroEixos;
    }

    public int getCapacidadeEmToneladas(){
        return this.capacidadeEmToneladas;
    }
}
