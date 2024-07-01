package unidade7;

public class exemplo7 {
    static int realizarConta(int x, int y) {
        return y / x;
    }

    public static void main(String[] args) {
        try {
            int z = realizarConta(2, 10);
            System.out.println(z);

            String x = null;
            System.out.println(x.length());
        } catch (ArithmeticException | NullPointerException e) { // 2 tipos de
            System.out.println(e.getMessage());                  // exceção
                                                                // tratados da
    }                                                           // mesma forma
        System.out.println("FIM");
    }
}
