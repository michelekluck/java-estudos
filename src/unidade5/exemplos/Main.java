package unidade5.exemplos;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto2>();

        carros.add(new Carro("Forda Ka", "Zetec Rocam 1.2", 257));
        carros.add(new Carro("Fiat Uno", "Firefly 1.0", 290));

        motos.add(new Moto2("Harley Davidson", "Milwaukee-Eight", 1868));
        motos.add(new Moto2("Honda Biz", "OHC 4 tempos", 125));

        for (var carro : carros) {
            System.out.println(carro.imprimir());
        }

        for (var moto2 : motos){
            System.out.println(moto2.imprimir());
        }
    }
}
