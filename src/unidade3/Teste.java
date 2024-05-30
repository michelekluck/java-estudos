package unidade3;

public class Teste {
    public static void main(String[] args) {
        Automovel auto = new Automovel("Chevrolet", "Onix", "ABC1234");

        System.out.println("Marca: " + auto.marca);  // acessivel porque é public
        System.out.println("Modelo: " + auto.modelo); // acessivel porque é protected
        // System.out.println("Placa: " + auto.placa); // ERRO ! Não tem acesso ao atributo placa diretamente porque ele é private
        System.out.println("Placa: " + auto.getPlaca()); // acessivel através do método getPlaca
    }
}
