package unidade7;

public class exemplo4 {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Exceção capturada no main: " + e.getMessage());
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        throw new Exception("Ocorreu um erro!");
    }
}
