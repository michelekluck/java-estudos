package unidade8.exemplo2;

import java.io.Serializable;

public class Mamifero implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nome;
    private int idade;
    private String dono;
    protected String especie;

    public Mamifero(String nome, int idade, String dono, String especie){
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.especie = especie;
    }

    public String toString(){
        String retorno = "";
        retorno += "Nome: " + this.nome + "\n";
        retorno += "Idade: " + this.idade + " anos\n";
        retorno += "Dono: " + this.dono + "\n";
        retorno += "Espécie: " + this.especie + "\n";
        retorno += "Barulho: " + soar() + "\n";
        return retorno;
     }

     public String soar(){
        return "";
     }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

}
