package unidade2;
import java.util.ArrayList;

public class teste_arrayList { // definimos uma classe chamada teste_ArrayList
    public static void main(String[] args){ // método principal -> onde a execução do programa começa
        ArrayList<String> carros = new ArrayList<String>(); // Cria uma nova instância
        carros.add("Fiat");
        carros.add("Ford");
        carros.add("VW");
        carros.add("Chevrolet");

        for (String i : carros)
            System.out.println(i);

        System.out.println(carros.size());

        carros.set(0, "Ferrari");

        System.out.println(carros.get(0));

        carros.clear();
        System.out.println(carros.size());

        for (String i : carros)
            System.out.println(i);

    }
}
