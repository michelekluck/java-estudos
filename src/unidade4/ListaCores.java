package unidade4;
import java.util.ArrayList;

public class ListaCores {
    public static void main(String[] args) {
        int i;
        // declara a instancia o ArrayList cores
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Azul"); // inclui o elemento no ArrayList
        cores.add("Verde");
        cores.add("Vermelho");
        cores.add("Amarelo");

        // loop para percorrer a lista, elemento por elemento
        for (i = 0; i < cores.size(); i++) // imprime cada elemento
            System.out.println((i + 1) + "º)" + cores.get(i));

        // ALTERA elemento da lista:
        cores.set(1, "Pink"); // altera elemento na posição 1 para "Pink"

        i = 0;
        System.out.println("----");
        // Loop for-each para percorrer a lista, elemento por elemento
        for (String c : cores) {
            System.out.println((i + 1) + "º) " + c);
            i++;
        }

        // REMOVE elemento da lista da posição 3: "Vermelho"
        cores.remove(3);

        i = 0;
        System.out.println("----");
        // Loop for-each para percorrer a lista, elemento por elemento
        for (String c : cores) { // imprime elemento por elemento
            System.out.println((i + 1) + "º) " + c);
            i++;
        }

        // LIMPA a lista: exclui todos os objetos de String
        cores.clear();

        System.out.println("----");
        System.out.println("Tamanho da lista = " + cores.size());

    }
}
