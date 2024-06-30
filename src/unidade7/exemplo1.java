package unidade7;

public class exemplo1 {
    static int realizarDivisao(int numerador, int denominador){
        try {
            // codigo que pode dar exceção
            return numerador / denominador;
        } catch (ArithmeticException e) { // tratando apenas erro de divisão por 0.
            // tratamento da exeção
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println(realizarDivisao(4,2));
        System.out.println(realizarDivisao(35,5));
        System.out.println(realizarDivisao(40,0));
    }
}
