package unidade3;

public class StringExamples {
    public static void main(String[] args) {
        String txt;

        txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Comprimento de [" + txt + "] = " + txt.length());

        txt =  "Olá mundo!";
        System.out.println(txt.toUpperCase()); // saida = "OLÁ MUNDO!"
        System.out.println(txt.toLowerCase()); // saida = "olá mundo!"

        txt = "Localize a posição da palavra 'eureka' neste texto!";
        System.out.println(txt.indexOf("eureka")); // saida = 31
    }
}
