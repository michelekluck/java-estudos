package unidade6.funcionarios;

// estente a classe abstrata funcionario
// temporario é um tipo especifico de funcionario
public class Temporario extends Funcionario {
    // quantidade de meses que o contrato do funcionario temporario dura
    public int mesesContrato;

    // construtor aceita dois atributos e usa esses valores para inicializar os atributos correspondentes da classe
    // o atributo salarioBase é herdado da classe funcionario
    public Temporario(double salarioBase, int mesesContrato){
        this.salarioBase = salarioBase;
        this.mesesContrato = mesesContrato;
    }

    // implementação do método abstrato que foi declarado na classe funcionario
    // calcula a gratificação do funcionario temporario com base nos meses de contrato
    // cada mes de contrato rende ao funcionario uma gratificação de 100 unidades monetaris (R$)
    // exemplo de polimorfismo -> embora a classe temporario seja uma subclasse da classe funcioario, ela fornecede uma implementação especifica do metodo getGratificacao(), adequada para funcionarios temporarios
    // outros tipos de fucionario podem ter diferentes implementações deste método
    protected double getGratificacao(){
        return this.mesesContrato * 100;
    }

}
