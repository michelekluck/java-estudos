package unidade6.netflix;

public class Filme extends ConteudoNetflix {

    public Filme(String titulo, double duracao){
      super(titulo, duracao);
    }

    public void reproduzir(){
        System.out.println("Reproduzindo o filme: " + this.titulo + ", com duração de: " + this.duracao);
    }
}
