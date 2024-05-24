package unidade2;

public class Circulo {
    // Atributos de classe
    private double raio;

    // Constante PI definida como final static
    final static double PI = 3.141592653589793; // final = significa que o valor de PI não pode ser alterado após definido
    // static = significa que PI pertence a classe Circulo, e não a um objeto específico dessa classe.
    // qualquer objeto Circulo que criarmos terá acesso a esse mesmo valor de PI.


    //Método construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular o perimetro (ou circunferência) do circulo
    public double calcularPerimetro() {
        return 2 * PI * this.raio; // usa o valor de PI que definimos anteriormente
    }
        // Método principal
        public static void main(String[] args) {
            //Criação de uma instancia de Circulo com raio 5
            Circulo meuCirculo = new Circulo(5);

            // Calculo e impressão do perimetro
            double perimetro = meuCirculo.calcularPerimetro();
            System.out.println("O perimetro do circulo é: " + perimetro);
    }
}