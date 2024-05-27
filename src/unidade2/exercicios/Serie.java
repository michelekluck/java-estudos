package unidade2.exercicios;
/*adicionar um novo arquivo no projeto com o nome de Serie.java. Este arquivo deve conter
 uma classe chamada Serie, o qual possui dois atributos: o nome da série e uma lista de episódios
 (objetos do tipo Episodio que criamos no exercício anterior). Esta classe precisa de um método que
 mostre na tela os dados da Série*/

import java.sql.Array;
import java.util.ArrayList;

public class Serie {
    // Atributos da classe Serie
    String nome;
    ArrayList<Episodio> episodios; // crio uma arraylist com objetos do tipo 'Episodio'
    // epsiodios é o nome da variavel que esta sendo declarada. esta variavel sera uasada para referenciar o 'ArrayList' que conterá obejtos do tipo 'Episodio'

    // Método construtor da classe Serie
    Serie(String nome) { // inicializa um novo objeto da classe 'Serie' com um nome e cria uma lista vazia de episodios
        this.nome = nome; // atribui o valor do parametro 'nome' ao atributo 'nome' do objeto
        this.episodios = new ArrayList<>(); // cria uma nova lista vazia de episodios
    }

    // Método para adicionar episódio a serie
    void adicionarEpisodio(Episodio episodio) {
        this.episodios.add(episodio); // adiciona o episodio passado como parametro a lista 'episodios'
    }

    // Método para imprimir as informações da serie
    void imprimirInfoSerie() {
        System.out.println("Série: " + this.nome);
        System.out.println("Episódios: ");
        for (Episodio episodio : this.episodios) { // itera sobre a lista de episodios e chama o metodo 'imprimirInfoEpisodio' para cada um
            episodio.imprimirInfoEpisodio();
        }
    }
    // Método principal
    public static void main(String[] args) {
        // Criação de instâncias de Episódio
        Episodio episodio1 = new Episodio("Episodio 1" , 45);
        Episodio episodio2 = new Episodio("Episodio 2", 52);
        Episodio episodio3 = new Episodio("Episodio 3", 49);

        // Criação de uma instância de Serie
        Serie serie = new Serie("Serie 1"); // cria uma instancia 'Serie' com o nome 'Serie 1'

        // Adicionando episodios a uma Serie
        serie.adicionarEpisodio(episodio1);
        serie.adicionarEpisodio(episodio2);
        serie.adicionarEpisodio(episodio3);

        // Adicionando episódios de um outro jeito
        serie.adicionarEpisodio(new Episodio("Episodio 4", 64 ));
        serie.adicionarEpisodio(new Episodio("Episodio 5", 55));

        // Mostrando as informações da Serie
        serie.imprimirInfoSerie();
    }
}
