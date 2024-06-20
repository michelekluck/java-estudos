package unidade5.heranca;

public class Pessoa {
    // atributos com dados iniciais
    // se nada for atribuido a esses atributos o que esta depois do simbolo = sera usado
    // ou seja: se eu deixar o nome vazio, ao executar o codigo o nome virá como "nenhum"
    private String nome = "nenhum";
    private int idade = 0;
    private String profissao = "não sei ainda";

    // getters
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getProfissao(){
        return this.profissao;
    }

    // setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

}
