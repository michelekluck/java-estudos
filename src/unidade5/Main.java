package unidade5;

public class Main {
    public static void main(String[] args){
        Veiculo carroDoVizinho = new Veiculo("Peugeot", "1.6 THP");
        Veiculo nossoCaminhao = new Caminhao("Volvo", "Motor aleatorio", 4, 20);

        //System.out.println("O carro do vizinho é um " + carroDoVizinho.getMarca());
        //System.out.println("O nosso caminhão é um " + nossoCaminhao.getMarca());

        carroDoVizinho.getDetalhes();
        nossoCaminhao.getDetalhes();

        carroDoVizinho.getSom();
        nossoCaminhao.getSom();
    }
}
