package unidade6.exercicio1;

public abstract class ConteudoNetflix {
    private String titulo;
    private  double duracao;

    public String getTitulo(){
        return this.titulo;
    }

    public double getDuracao(){
        return this.duracao;
    }

    protected abstract void reproduzir();
}
