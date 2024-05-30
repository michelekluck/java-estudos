package unidade3.exemplos;
/*crie um algoritmo em Java que contenha três variáveis inteiras,
duas booleanas e uma do tipo float. Utilize comentários e operadores
aritméticos, lógicos e relacionais no código.*/
public class operadoresAritmeticos {
    public static void main(String[] args){
        // declaração das variaveis
        int x, y; // declaramos duas variaveis inteiras
        int X; // X maiusculo é diferente de x minusculo
        boolean p, q; // declaramos duas variaveis booleanas
        float a = 10.5f; // declaramaos uma varuacek de ponto flutuate e atribuimos a ela valor 10.5
        // é necessário adicionar o "f" ao final para indicar que é um valor de ponto flutuante

        /*Aqui atribuimos valores as variaveis que criamos anteriormente.
        Perceba que todas as linhas terminam com ponto e virgula
         */
        x = 10; // atribuimos o valor 10 a varuavel x
        y = x - 38; // atribuimos o resultado da expressao a variavel y
        X = 0 % 2; // atribuimos o resultado da operação na variavel X
        p = (3 >= 5); // atribuimos o resultado da expressão booleana a variavel p
        q = (true || false); // atribuimos o resultado da expressão booleana a variavel q

        /*
        Aqui mostramos uma sequencia de mensagens na tela
         */
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("X = " + X);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.printf("a = %.2f", a*3); // usamos o metodo printf para imprimir o valor de a multiplicado por 3 com somente duas casas decimais
    }
}
