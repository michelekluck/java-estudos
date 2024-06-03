package unidade3;

/*crie um projeto em Java contendo uma classe chamada Carro.
 Ela possui dois atributos privados: marca (o nome da marca) e ligado (se o carro está
 ligado ou desligado). A classe precisa de métodos públicos getter e setter para cada um destes atributos.*/

public class Carro {
    private String marca; // atributo oculto (encapsulado)
    private boolean ligado; // atributo oculto (encapsulado)

    public Carro(String marca, boolean ligado) { //
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() { // retorna o valor do atributo privado "marca"
        return marca;
    }

    public void setMarca(String marca) { // altera o valor de "marca"
        this.marca = marca;
    }

    public boolean isLigado() { // retorna o valor de "ligado"
        return ligado;
    }

    public void setLigado(boolean ligado) { // altera valor ligado
        this.ligado = ligado;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", false); // instancia Carro
        System.out.println("Marca: " + meuCarro.getMarca()); // retorna valor
        System.out.println("Ligado: " + (meuCarro.isLigado() == true ? "Ligado" : "Desligado"));
        // operador ternário = é um atalho para um comando if-else. ele verifica se meuCarro.isLigado() é true
        // Se for, ele retorna "Ligado", caso contrario retorna "Desligado"

        meuCarro.setMarca("Renault"); // altera valor de atributo privado
        // marca eé alterada pars "Renault"

        meuCarro.setLigado(true); // altera valor de atributo privado
        // o estado ligado passa a ser true

        // retorna novamente a marca do carro e se ele esta ligado ou não, mas desta vez refletindo as mudanças que foram feitas
        System.out.println("Marca: " + meuCarro.getMarca()); // retorna valor
        System.out.println("Ligado: " + (meuCarro.isLigado() == true ? "Ligado" : "Desligado"));
    }
}
