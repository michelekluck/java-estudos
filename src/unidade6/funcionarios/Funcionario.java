package unidade6.funcionarios;

// classe abstrata
// não podemos instanciar um obeto da classe funcionario diretamente
public abstract class Funcionario {
    // protected -> atributo so pode ser acessado diretamente pela propria classe e por qualquer classe que a estenda
    protected double salarioBase;

    // método que retorna a soma do salario base com uma gratificação
    // esse metodo esta usando um método (getGraficicacao) que não foi definido ainda e que precisaremos implementar em todas as classes que herdam funcionario
    // polimorfismo -> diferentes tipos de funcionarios podem ter maneiras diferentes de calcular a gratificação
    // mas todos terão algum tipo de gratificação que sera adicionada ao salarioBase para obter o salario total
    public double getSalario(){
        return this.salarioBase + getGratificacao();
    }

    // método abstrato = método sem corpo - apenas assinatura é fornecida
    // qualquer classe que estenda funcionario DEVE fornecer uma implementação para este método
    protected  abstract double getGratificacao();
}
