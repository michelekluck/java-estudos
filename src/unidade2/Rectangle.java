package unidade2;

public class Rectangle {
    // atributos
    float height; // altura
    float length; // comprimento

    // metodos
    Rectangle(float initialHeight){
        this.height = initialHeight;
        this.length = 10.0f;

    }

    Rectangle(float initialHeight, float initialLength){
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

        Rectangle ret1 = new Rectangle(5.2f, 12.5f); // locação de memória
        System.out.println(ret1.calculatePerimeter());

        Rectangle ret2 = new Rectangle(10.3f);
        System.out.println(ret2.calculatePerimeter());
    }
}

