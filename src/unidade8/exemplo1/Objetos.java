package unidade8.exemplo1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objetos {
    public static void escrevePessoas(String filename) {
        ObjectOutputStream outputStream = null;
        // objectoutputstream -> usado para escrever objetos
        try {
            outputStream = new ObjectOutputStream (new FileOutputStream(filename));

            Pessoa person = new Pessoa();
            person.setNome("James");
            person.setSobrenome("Ryan");
            person.setIdade(19);
            outputStream.writeObject(person); //só escreve pq Pessoa é seralizável

            person = new Pessoa();
            person.setNome("Obi-wan");
            person.setSobrenome("Kenobi");
            person.setIdade(30);
            outputStream.writeObject(person); //só escreve pq Pessoa é seralizável

            outputStream.flush(); // força dados em buffer a serem gravados
            outputStream.close(); // fecha arquivo de escrita

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void lePessoas(String filename) {
        ObjectInputStream inputStream = null;
        // objectinputstream -> usado para ler objetos
        try {
            inputStream = new ObjectInputStream (new FileInputStream(filename));
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Pessoa) // le um objeto genérico
                    System.out.println(((Pessoa)obj).toString()); // cast para Pessoa
            }
            inputStream.close();
        } catch (EOFException ex) { // quando EOF (End Of File) é alçancado
            System.out.println("Fim de arquivo alcançado.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        escrevePessoas("arqObjs.txt");
        lePessoas     ("arqObjs.txt");
    }
}
