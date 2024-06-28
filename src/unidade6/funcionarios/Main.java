package unidade6.funcionarios;
import java.util.*;

public class Main {
    // método imprimir recebe uma lista de objetos do tipo funcionario
    public static void imprimir(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) { // para cada funcionario na lista, ele imprime o salario-base e o salario com gratificação
            System.out.printf("Salario base: %.2f Salário com gratificação: %.2f%n", funcionario.salarioBase, funcionario.getSalario());
        }
    }

    // embora a lista seja do tipo funcionario, adicionamos objetos das classes concursado e temporario
    // porque essas duas classes estendem funcionario
    // exemplo de polimorfismo -> pode-se tratar objetos de concursado e temporario como objetos de funcionario

    // ponto de entrada do programa
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>(); // cria uma arraylist de funcionario
        // adicionamos na lista alguns objetos concursado e temporario
       funcionarios.add(new Concursado(4000,5));
       funcionarios.add(new Temporario(2000,12));
       funcionarios.add(new Concursado(2400,34));
       funcionarios.add(new Temporario(1200,10));
       imprimir(funcionarios); // chamamos o metodo imprimir passando essa lista (funcionarios)
    }
}
// quando executamos esse codigo, o método getSalario() chamado para cada funcionario na lista será a versão do método que corresponde ao tipo real do objeto (concursado ou temporario)
// isso é chamado de vinculação dinamica, e é outra manifestação de polimorfismo
