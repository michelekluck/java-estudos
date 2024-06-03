package unidade3;

public class Banco {
    public static void main(String []ars){

        // cria objetos da classe Conta
        Conta cta1 = new Conta(1000, "Carlos");
        Conta cta2 = new Conta(3000, "João");

        // codigo para alterar o saldo da cta1
        cta1.setSaldo(4000);
        // codigo para alterar o nome do dono da cta1
        cta1.setDono("Maria");

        // codigo para alterar o saldo da cta2
        cta2.setSaldo(2000);
        // codigo para alterar o nome do dono da cta2
        cta2.setDono("Marcos");

        System.out.println("Cta 1 - Correntista: " + cta1.getDono());
        System.out.println("Cta 1 - Saldo: " + cta1.getSaldo());

        System.out.println("Cta 2 - Correntista: " + cta2.getDono());
        System.out.println("Cta 2 - Saldo: " + cta2.getSaldo());
    }
}
