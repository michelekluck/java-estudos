package unidade6.funcionarios;

// estende a classe abstrata funcionario
public class Concursado extends Funcionario {
    // esse atributo representa a quantidade de anos que o funcionario concursado trabalhou
    private int anosTrabalho;

    // construtor aceita dois parametros e os usa para inicializar os atributos correspondentes da classe
    public Concursado(double salarioBase, int anosTrabalho){
        this.salarioBase = salarioBase; // atributo herdado da classe funcionario
        this.anosTrabalho = anosTrabalho;
    }

    // implementação do método abstrato que foi declarado na classe funcionario
    // calcula a gratificaçao com base nos anos de trabalho do funcionario
    // para cada quinquenio (5 anos) o funcionario recebe uma gratificação equivalente a 2% do seu salario base
    // a variavel quinquenio é calculada dividindo anosTrabalho por 5
    // exemplo de polimorfismo
    // a classe concursad fornece a propria implementação para o metodo getGratificacao que é especifico para concursados
    protected double getGratificacao(){
        int quinquenio = this.anosTrabalho / 5;
        return quinquenio * 0.02 * this.salarioBase;
    }
}
