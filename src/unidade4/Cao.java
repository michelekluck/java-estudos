package unidade4;

public class Cao {
    // atributos
    private Dono meuDono;
    private String nomeCao;
    private String raca;
    private String genero;
    private int idade;
    private Cauda minhaCauda;

    // metodo construtor
    public Cao(String nome, String raca, String genero, int idade, String forma, String tipoPelo){
        this.nomeCao = nome;
        this.raca = raca;
        this.genero = genero;
        this.idade = idade;
        this.minhaCauda = new Cauda(forma, tipoPelo);
    }

    // metodo setter = para alterar o meuDono
    public void setMeuDono(Dono meuDono) {
        this.meuDono = meuDono;
    }

    // metodo getter = retorna o valor nome do cão
    public String getNomeCao() {
        return nomeCao;
    }

    public void printCao(){
        System.out.println(" Nome: " + this.nomeCao);
        System.out.println(" Raça: " + this.raca);
        System.out.println(" Genero " + this.genero);
        System.out.println(" Idade: " + this.idade);
        minhaCauda.printCauda();
        System.out.println();
    }

    public void realizarRefeicao(){
        System.out.println(this.nomeCao + " fazendo sua refeição.");
    }

    public void agradarDono(){
        this.meuDono.receberFesta(); // invoca metodo da classe Dono
    }
}
