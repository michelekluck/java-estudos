package unidade2.exercicios;
/*. Este arquivo deve conter uma classe chamada Episodio, o qual possui três atributos
(título e duração), e um método que mostra na tela esses dois atributos. Instancie cinco
objetos desta classe*/

public class Episodio { // criamos uma classe chamada Episodio
    // Atributos da classe
    // a classe tem 2 atributos: titulo e duracao
    // private -> significa que o acesso ao método será apenas de dentro da classe onde ele foi criado, nenhuma outra classe poderá utilizar esse método
    private String titulo;
    private int duracao;

    // Método construtor da classe Episidio
    // método construtor é um bloco de codigo especial dentro de uma classe, designado para inicializar novos objetos
    // o construtor Episodio permite a criação de objetos com titulos e duracioes especificos
    public Episodio(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // Método para imprimir as informações do episódio
    public void imprimirInfoEpisodio() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Duração: " + this.duracao + " minutos");
    }

    // Método principal
    public static void main(String [] args) {
        // Criação de instâncias de Episódio
        // quando criamos um objeto em Java, estamos criando uma instância de uma classe
        Episodio episodio1 = new Episodio("Episódio1", 45);
        // declaramos uma variavel chamads "episodio1"
        // essa variavel sera usada para armazenar a referencia de um objeto tipo "Episodio"
        // new -> cria um novo objeto da classe "Episodio"
        // new "Episodio()" - chama o construtor da classe Episodio e passa dois argumentos a ele
        // esses argumentos são usados para inicializar os atributos do objeto "Episodio"
        Episodio episodio2 = new Episodio("Episódio 2", 52);
        Episodio episodio3 = new Episodio("Episódio 3",49);
        Episodio episodio4 = new Episodio("Episódio 4", 64);
        Episodio episodio5 = new Episodio("Episódio 5", 55);

        // Mostrando as informações de um episodio como exemplo
        episodio2.imprimirInfoEpisodio();
    }
}