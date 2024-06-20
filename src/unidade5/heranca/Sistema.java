package unidade5.heranca;

public class Sistema {
    public static void main(String[] args){
        // criamos um objeto chamado maria, da classe Pessoa
        Pessoa maria = new Pessoa();
        // usamos os metodos setters com o objeto maria para atribuir valores para os atributos
        // o método setter serve para atribuir valores/dados para atributos privados
        maria.setNome("Maria da Silva"); // atribuimos o nome maria da silva
        maria.setIdade(21); // atribuimos a idade 21
        maria.setProfissao("Analista de Sistemas"); // atribuimos a profissão analista de sistemas

        // imprimimos na tela o nome, idade e profissão do objeto maria, usando os métodos getters (que servem para retornar dados)
        System.out.println("Dados de pessoa: ");
        System.out.println("Nome: " + maria.getNome());
        System.out.println("Idade: " + maria.getIdade());
        System.out.println("Profissão: " + maria.getProfissao());

        System.out.println("-----------------------------------");

        Aluno joao = new Aluno();
        joao.setNome("João da Silva");
        System.out.println("Dados de aluno: ");
        System.out.println("Nome: " + joao.getNome());
        System.out.println("Idade: " + joao.getIdade());
        System.out.println("Profissão: " + joao.getProfissao());

        System.out.println("-----------------------------------");


        Professor mauricio = new Professor();
        System.out.println("Dados de professor: ");
        System.out.println("Nome: " + mauricio.getNome());
        System.out.println("Idade: " + mauricio.getIdade());
        System.out.println("Profissão: " + mauricio.getProfissao());
    }
}
