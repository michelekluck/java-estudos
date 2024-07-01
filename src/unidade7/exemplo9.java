package unidade7;

public class exemplo9 {
    static int realizarConra(int x, int y){
        return y / x;
    }

    public static void main(String[] args){
        try {
            int z = realizarConra(0,10);
            System.out.println(z);
        } catch(ArithmeticException e){
            System.out.println("Mostrando o getMessage(): ");
            System.out.println(e.getMessage());

            System.out.println("\nMostrando o getCause(): ");
            System.out.println(e.getCause());

            System.out.println("\nMostrando o printStackTrace(): ");
            e.printStackTrace();
        }


    }
}
