package unidade5.exemplos.exemplo1;

/*modifique a classe main para que todos os veículos estejam em uma única lista.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var veiculos = new ArrayList<Veiculo2>();

        veiculos.add(new Carro("Forda Ka", "Zetec Rocam 1.2", 257));
        veiculos.add(new Carro("Fiat Uno", "Firefly 1.0", 290));
        veiculos.add(new Moto2("Harley Davidson", "Milwaukee-Eight", 1868));
        veiculos.add(new Moto2("Honda Biz", "OHC 4 tempos", 125));
        veiculos.add(new Onibus("Mercedes Benz", "V8", 50, true));
        veiculos.add(new Onibus("Scania Escolar", "V8", 15, false));

        for (var veiculo : veiculos) {
            System.out.println(veiculo.imprimir());
        }
    }
}
