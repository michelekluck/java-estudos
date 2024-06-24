package unidade5;

public class Main {
    public static void main(String[] args){
        Veiculo motoDoVizinho = new Moto("Honda", "Motor da honda", 250);
        Veiculo nossoCaminhao = new Caminhao("Volvo", "Motor aleatorio", 4, 20);

        //System.out.println("O carro do vizinho é um " + carroDoVizinho.getMarca());
        //System.out.println("O nosso caminhão é um " + nossoCaminhao.getMarca());

        motoDoVizinho.getDetalhes();
        nossoCaminhao.getDetalhes();

        motoDoVizinho.getSom();
        nossoCaminhao.getSom();
    }
}
