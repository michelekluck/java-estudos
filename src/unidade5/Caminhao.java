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

    // override: sobrescrita de métodos
    public void getDetalhes(){
        super.getDetalhes();
        System.out.println("O nosso caminhão tem uma capacidade de " + getCapacidadeEmToneladas() + " toneladas");
    }

    // overload: sobrecarga de métodos
    public void getDetalhes(boolean mostrarEixos){
        if (mostrarEixos) {
            System.out.println("O caminhão tem " + getNumeroEixos() + " eixos");
        } else {
            System.out.println("Não mostrarei nada sobre os eixos.");
        }
    }

    public void getDetalhes(int quantidadeLinhasEmBranco){
        for( int i = 0; 1 < quantidadeLinhasEmBranco; i++ ){
            System.out.println();
        }
        super.getDetalhes();
    }

    public void getSom(){
        System.out.println("Os caminhões são grandes e barulhentos.");
    }
}
