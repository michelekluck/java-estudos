package unidade2;

public class rectangle {
    // atributos
    float height; // altura
    float length; // comprimento

    // metodos
    rectangle(float initialHeight){
        this.height = initialHeight;
        this.length = 10.0f;

    }

    rectangle(float initialHeight, float initialLength){
        this.height = initialHeight;
        this.length = initialLength;
    }

    float calculatePerimeter(){
        return (2 * height) + (2 * length);
    }

    float calculateArea(){
        return height * length;
    }

    // ponto de partida do nosso codigo
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao mundo dos retângulos");

        rectangle ret1 = new rectangle(5.2f, 12.5f); // locação de memória
        System.out.println(ret1.calculatePerimeter());

        rectangle ret2 = new rectangle(10.3f);
        System.out.println(ret2.calculatePerimeter());
    }
}
