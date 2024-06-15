package unidade5.exemplos.exemplo1.exemplo2;

/*crie um projeto em Java contendo uma única classe com o nome de soma. Esta
 classe deve possuir três métodos, todos chamados de somar(). Um dos métodos terá como parâmetros
 dois números inteiros. Outro, dois números do tipo double. Outro, três números inteiros.*/

public class Soma {
    // overloaded (sobrecarga) de somar(). Esta soma tem 2 parametros int
    // return int
    public int somar (int x , int y){
        return(x + y);
    }

    // overloaded (sobrecarga) de somar(). Esta toma tem 3 parametros int
    // return int
    public int somar(int x, int y, int z){
        return (x + y + z);
    }

    // overloaded (sobrecarga) de somar(). Esta soma tem 2 parametros double
    // returno double
    public double somar(double x, double y) {
        return(x + y);
    }

    public static void main (String[] args) {
        Soma s = new Soma();
        System.out.println(s.somar(3,4));             // invoca somar
        System.out.println(s.somar(3, 4, 5));     // invoca somar
        System.out.println(s.somar(3.4, 5.6));      // invoca somar
    }
}
