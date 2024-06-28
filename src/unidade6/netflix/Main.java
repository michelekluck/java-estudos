package unidade6.netflix;

public class Main {
    public static void main(String[] args){
        ConteudoNetflix filme1 = new Filme("A era do Gelo", 1);
        ConteudoNetflix serie1 = new Serie("Black Mirror", 8);
        filme1.reproduzir();
        serie1.reproduzir();
    }
}
