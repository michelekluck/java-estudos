package unidade7;

public class exemplo8 {
    static int realizarConta(int x, int y) {
        return y / x;
    }

    public static void main(String[] args) {
        try {
            int z = realizarConta(2, 10); // retorna 5
            if (z == 5) return; // causa saida do método main porque z é 5

            System.out.println(z);

            String x = null;
            System.out.println(x.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sempre executado!"); // esse bloco é executado
        }
        System.out.println("FIM"); // essa linha não é executada pois o return saiu do método main antes
    }

}
