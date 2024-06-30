package unidade7;

public class exemplo5 {
    static int realizarConta(int x, int y) {
        return y / x;
    }

    public static void main(String[] args) {
        try {
            int z = realizarConta(10, 10);
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        }
        System.out.println("FIM");
    }
}
