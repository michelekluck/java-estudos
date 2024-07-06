package unidade8.exemplo2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.*;

public class PetStore{
    private ArrayList<Mamifero> mamiferos;

    public PetStore(){
        this.mamiferos = new ArrayList<Mamifero>();
    }
    public String[] leValores (String [] dadosIn){
        String [] dadosOut = new String[dadosIn.length];

        for (int i = 0; i < dadosIn.length; i++)
         dadosOut[i] = JOptionPane.showInputDialog("Entre com " + dadosIn[i] + ": ");

        return dadosOut;
    }

    public Gato leGato(){
        String[] valores =  new String [3];
        String [] nomeVal = {"Nome", "Idade", "Dono"};
        valores = leValores (nomeVal);

        int idade = this.retornaInteiro(valores[1]);

        Gato gato = new Gato(valores[0], idade, valores[2]);
        return gato;
    }

    public Cao leCao(){
        String [] valores = new String [3];
        String [] nomeVal = {"Nome", "Idade", "Dono"};
        valores = leValores(nomeVal);

        int idade = this.retornaInteiro(valores[1]);
        Cao cao = new Cao (valores[0], idade, valores [2]);
        return cao;
    }

    private boolean intValido(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public int retornaInteiro(String entrada){
        int numInt;

        while(!this.intValido(entrada)){
            entrada = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um numero inteiro.");
        }
        return Integer.parseInt(entrada);
    }

    public void salvaMamiferos (ArrayList<Mamifero> mamiferos){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream
                    (new FileOutputStream("/tmp/petStore.dados"));
            for (int i = 0; i < mamiferos.size(); i++)
                outputStream.writeObject(mamiferos.get(i));
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Impossivel criar arquivo!");
            ex.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
    @SuppressWarnings("finally")
    public ArrayList<Mamifero> recuperarMamiferos (){
        ArrayList<Mamifero> mamiferosTemp = new ArrayList<Mamifero>();

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream
                    (new FileInputStream("/tmp/petStore.dados"));
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Mamifero) {
                    mamiferosTemp.add((Mamifero) obj);
                }
            }
        } catch (EOFException ex) {
            System.out.println("Fim de arquivo.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Arquivo com mamiferos NÃO existe!");
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (final IOException ex){
                ex.printStackTrace();
            }
            return mamiferosTemp;
        }
    }

    public void menuPetStore() {
        String menu = "";
        String entrada;
        int opc1, opc2;
        do {
            menu = "Controle PetStore\n" + "Opções:\n" +
                    "1. Entrar Mamiferos\n" +
                    "2. Exibir Mamiferos\n" +
                    "3. Limpar Mamiferos\n" +
                    "4. Gravar Mamiferos\n"+
                    "5. Recuperar Mamiferos\n" +
                    "9. Sair";
            entrada = JOptionPane.showInputDialog(menu + "\n\n");
            opc1 = this.retornaInteiro(entrada);

            switch (opc1) {
                case 1:// Entrar dados
                    menu =  "Entrada de animais Mamiferos\n" +
                            "Opções\n" +
                            "1. Cão\n" +
                            "2. Gato\n";

                    entrada = JOptionPane.showInputDialog(menu + "\n\n");
                    opc2 = this.retornaInteiro(entrada);

                    switch (opc2) {
                        case 1: mamiferos.add((Mamifero) leCao());
                        break;
                        case 2: mamiferos.add((Mamifero) leGato());
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "Entrada NÃO valida!");
                    }
                    break;
                case 2: // exibir dados
                    if (mamiferos.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Entre com mamiferos...");
                        break;
                    }
                    String dados = "";
                    for (int i = 0; i < mamiferos.size(); i++) {
                        dados += mamiferos.get(i).toString() + "------------------\n";
                }
                    JOptionPane.showMessageDialog(null, dados);
                    break;
                case 3: // limpar dados
                    if (mamiferos.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Entre com mamiferos...");
                        break;
                    }
                    mamiferos.clear();
                    JOptionPane.showMessageDialog(null, "Dados LIMPOS com sucesso!");
                    break;
                case 4: // gravar dados
                    if (mamiferos.size() == 0){
                        JOptionPane.showMessageDialog(null, "Entre com mamiferos...");
                        break;
                    }
                    salvaMamiferos(mamiferos);
                    JOptionPane.showMessageDialog(null, "Dados SALVOS com sucesso!");
                    break;
                case 5: // recupera dados
                    mamiferos = recuperarMamiferos();
                    if ( mamiferos.size() == 0){
                        JOptionPane.showMessageDialog(null, "Sem dados para apresentar.");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Dados RECUPERADOS com sucesso!");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Fim do aplicativo PETSTORE");
                    break;
            }
        } while (opc1 != 9);
    }
    public static void main (String [] args){
        PetStore pet = new PetStore();
        pet.menuPetStore();
    }
}
