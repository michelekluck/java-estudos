package unidade8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopiarCaracter {
    // esse método escreve o texto em um arquivo chamado "arqChar1.txt"
    public static void EscreverCaracteres(){
        FileWriter out = null;
        int contLetra = 0;
        String texto = "Texto para gravar no arq.\nOutro texto para gravar no arq."; // aqui é definido o texto
        try {
            out = new FileWriter("arqChar1.txt"); // aqui o arquivo !!
            // se o arquivo não existir, ele será criado.
            // caso o arquivo ja exista, o conteudo anterior será substituido pelo novo texto
            while (contLetra < texto.length()){ // método escreve caractere por caractere no arquivo nesse loop
                out.write(texto.charAt(contLetra));// escreve caractere a caractere
                contLetra++;
            }
            out.close(); // fecha arquivo de saída
            // tratamendo de exceções:
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // esse método le o arquivo "arqChar1.txt" criado pelo método anterior
    public static void LerCaracteres() {
        FileReader in = null;
        try {
            in = new FileReader("arqChar1.txt");
            int c;
            // imprime o conteudo do arquivo caractere por caractere usando loop
            while ((c = in.read()) != -1) // escreve caractere a caractere; -1 = EOF
                System.out.print((char)c);// imprime como caractere
            in.close(); // fecha arquivo de entrada
            // tratamento de exceções:
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // esse método faz uma copia do conteudo do arquivo "arqChar1.txt" e grava em um novo arquivo chamado "arqCharLinha2.txt"
        public static void CopiarLinha(){
        //bufferereader le o conteudo do arquivo chamado "arqChar2.txt"
        BufferedReader in  = null; // bufferiza (acumula) para leitura cjto de chars
        PrintWriter    out = null; // bufferiza (acumula) para escrita cjto de chars
        String linha;
        try {// BufferedReader / PrintWriter  são usados em conjunto com
            //  FileReader e FileWriter, respectivamente (acumulam caracteres lidos)
            in   = new BufferedReader(new FileReader("arqChar1.txt")); //bufferereader le o conteudo de origem
            out  = new PrintWriter   (new FileWriter("arqCharLinha2.txt")); // escreve o arquivo de destino
            // leitura e escrita são feitas linha por linha, em vez de caractere por caractere
            while ((linha = in.readLine()) != null) {
                out.println(linha);
                System.out.println(linha);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println("\nEscrita---------------");
        EscreverCaracteres(); // texto é escrito no arquivo 'arqChar1.txt'
        System.out.println("\nLeitura---------------");
        LerCaracteres(); //conteudo do arquivo é lido e impresso na tela
        System.out.println("\nCopia---------------");
        CopiarLinha(); // conteudo do arquivo é copiado para o arquivo 'arqChar2.txt'
        // durane a copia, cada linha lida do arquivo de origem tambem é impresso na tela
    }
}
