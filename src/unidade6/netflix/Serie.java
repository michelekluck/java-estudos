package unidade6.netflix;

public class Serie extends ConteudoNetflix {
    public Serie(String titulo, double duracao){
        super(titulo, duracao);
    }

    public void reproduzir(){
        System.out.println("Reproduzindo serie: " + this.titulo + ", com duração de: " + this.duracao);
    }
}
