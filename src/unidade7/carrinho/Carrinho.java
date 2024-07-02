package unidade7.carrinho;

public class Carrinho {
    private int quantidadeMaxima;
    private int quantidade = 0;
    private int inseridos  = 0;
    private int removidos = 0;
    private double precoUnitario;

    public Carrinho(int quantidadeMaxima, double precoUnitario){
        this. quantidadeMaxima = quantidadeMaxima;
        this.precoUnitario = precoUnitario;
    }

    public void printCarrinho(){
        System.out.println(" - Qtd. máxima de itens no carrinho = " + quantidadeMaxima);
        System.out.printf(" - Preço unitario de cada item = R$ %.2f", precoUnitario);
    }

    public void inserir(){
        assert (quantidade < quantidadeMaxima): String.format("Inclução: carrinho cheio, já com %d itens.\n" ,quantidade); // PRÉ CONDIÇÃO
        quantidade++;
        inseridos++;
        assert(quantidade == inseridos - removidos); // INVARIANTE
    }

    public void remover()
    {
        assert quantidade > 0: "Remoção: carrinho vazio, não é possivel retirar mais itens."; // PRE CONDIÇÃO
        quantidade--;
        removidos++;
        assert quantidade == inseridos - removidos: "quantidade != inseridos - removidos"; // INVARIANTE
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double totalizar (double precoMaximo){
        double precoTotal = precoUnitario * quantidade;
        assert(precoTotal <= precoMaximo): String.format("Valor insuficiente: R$ %.2f para gastar foi ultrapassado.\n", precoMaximo); // POS CONDIÇÃO7
        return precoTotal;
    }

}
