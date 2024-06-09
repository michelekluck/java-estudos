package unidade4.exercicios;
import java.util.ArrayList;
/*Crie uma classe produto com atributos para "nome", "preco",
"quantidadeEmEstoque". Em seguida, crie uma classe CarrinhoDeCompras que contém um ArrayList
de produto. Adicione métodos à classe CarrinhoDeCompras para adicionar produtos ao carrinho,
remover produtos e calcular o total do carrinho.*/

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }

    public void decrementarEstoque(){
        if(this.quantidadeEmEstoque > 0) {
            this.quantidadeEmEstoque -= 1;
        } else {
            System.out.println("Estoque esgotado para o produto: " + this.nome);
        }
    }
}

class CarrinhoDeCompras{
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        produto.decrementarEstoque();
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Produto produto : this.produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public static void main(String[] args){
        Produto produto1 = new Produto("TV", 1200.00, 10);
        Produto produto2 = new Produto("Laptop", 2500.00,5);
        Produto produto3 = new Produto("Celular", 800.00, 20);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("Total do carrinho no inicio: " + carrinho.calcularTotal());

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        System.out.println("Total do carrinho depois adicionar: " + carrinho.calcularTotal());

        carrinho.removerProduto(produto2);

        System.out.println("Total do carrinho após remover o produto: " + carrinho.calcularTotal());
    }
}