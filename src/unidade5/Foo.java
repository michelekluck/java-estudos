package unidade5;

// criado uma classe chamada Foo
public class Foo {
    // método chamado a
    // esse método mostra na tela a letra "a"
    public void a() {
        System.out.println(("a"));
    }

    // método chamado b
    // esse método mostra na tela a letra "b"
    public void b(){
        System.out.println("b");
    }

    // método chamado print
    // esse método chama os dois métodos acima, a() e b()
    void print(){
        a();
        b();
    }
}

//classe Bar é uma subclasse de Foo
class Bar extends Foo {
    // classe Bar tem um método override
    // esse método sobrescreve o método a() da classe Foo
    // o método a() de Bar aparece na tela a letra "A"
    public void a() {
        System.out.println("A");
    }

    // método principal
    public static void main(String[] args) {
        // o Bar é um Foo
        Foo f = new Bar();
        // o método print é chamado do método foo (variavel f)
        f.print();
    }
}
// a saida desse codigo será Ab pois sobrescrevemos o método a() na subclasse Bar, e o b continua o mesmo pois não sobrescrevemos ele