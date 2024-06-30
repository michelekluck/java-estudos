package unidade7;

public class exemplo2 {
    static int realizarDivisao(int numerador, int denominador){
            return numerador / denominador;
    }

    public static void main(String[] args){
        try {
            System.out.println(realizarDivisao(4,2));
            System.out.println(realizarDivisao(35,5));
            System.out.println(realizarDivisao(40,0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage()); // pega o momento em que o erro aconteceu
            System.out.println("Deu um erro em algumas das divisões");
        }
    }
}
