package unidade5.exercicio;
/*Crie uma classe genérica chamada produto que contenha informações que todos
os produtos têm em comum (como idProduto, nome, preco). Agora, crie classes especializadas
como livro, eletronico e roupa, cada uma com atributos adicionais relevantes para esse tipo de produto.*/

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

class Produto {
    // atributos
    private String idProduto;
    private String nome;
    private double preco;

    // construtor
    public Produto(String idProduto, String nome, double preco){
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    // getters
    public String getIdProduto(){
        return idProduto;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

}

// subclasse de produto
class Eletronico extends Produto{
    // atributos especificos de eletronicos
    private String marca;
    private String modelo;

    // construtor
    public Eletronico(String idProduto, String nome, double preco, String marca, String modelo){
        super(idProduto, nome, preco); // inicialização dos atributos da classe produto
        // construtores dos atributos especificos de eletronicos
        this.marca = marca;
        this.modelo = modelo;
    }

    //getters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
}

//subclasse de produto
 class Livro extends Produto{
    // atributos especificos de livros
    private String autor;
    private int numPaginas;

    //construtor
    public Livro(String idProduto, String nome, double preco, String autor, int numPaginas){
        super(idProduto, nome, preco);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    //getters
    public String getAutor(){
        return autor;
    }

    public int getNumPaginas(){
        return numPaginas;
    }
}

// subclasse de produto
class Roupa extends Produto {
    // atributos especificos de roupas
    private String tamanho;
    private String cor;

    // construtor
    public Roupa(String idProduto, String nome, double preco, String tamanho, String cor){
        super(idProduto, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //getters
    public String getTamanho(){
        return tamanho;
    }

    public String getCor(){
        return cor;
    }
}

// metodo principal
public class Main{
    public static void main(String[] args){
        // criação de um objeto da classe livro
        Livro livro = new Livro("1", "O senhor dos anéis", 59.99, "J.R.R. Tolkien", 1200);
        // criação de um objeto da classe eletronico
        Eletronico eletronico = new Eletronico("2", "Samsung Galaxy S21", 5000, "Samsung", "Galaxy S21");
        // criação de um objeto da classe roupa
        Roupa roupa = new Roupa("3", "Camiseta Polo", 79.99, "M", "Azul");

        // imprimindo na tela
        System.out.println("Livro: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Preço: " + livro.getPreco());
        System.out.println("Eletronico: " + eletronico.getNome() + ", Marca: " + eletronico.getMarca() + ", Preço: " + eletronico.getPreco());
        System.out.println("Roupa: " + roupa.getNome() + ", Tamanho: " + roupa.getTamanho() + ", Preço: " + roupa.getPreco());

    }
}