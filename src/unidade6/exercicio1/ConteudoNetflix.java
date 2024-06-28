package unidade6.exercicio1;

public abstract class ConteudoNetflix {
    protected String titulo;
    protected double duracao;

    public ConteudoNetflix(String titulo, double duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public double getDuracao(){
        return this.duracao;
    }

    protected abstract void reproduzir();
}
