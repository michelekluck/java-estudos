package unidade7;

public class exemplo6 {
    static int realizarConta(int x, int y) {
        return y / x;
    }

    public static void main(String[] args) {
        try {
            int z = realizarConta(2, 10);
            System.out.println(z);

            String x = null;
            System.out.println(x.length());
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("FIM");
    }
}
