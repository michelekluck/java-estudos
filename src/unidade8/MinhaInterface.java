package unidade8;

import javax.swing.JOptionPane;

public class MinhaInterface {
    private boolean numeroInteiroValido(String s){
        boolean resultado;
        try {
            Integer.parseInt(s); // tenta transformar uma string em inteiro
            resultado = true;
        } catch (NumberFormatException e){
            resultado = false;
        }
        return resultado;
    }

    public int inteiroValido(String nomeVar){
        int numInt;
        String entrada;

        entrada = JOptionPane.showInputDialog(null, "Entre com um numero inteiro " + nomeVar + ":\n\n");

        // Loop para garantir um inteiro valido
        while (!this.numeroInteiroValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor de " + nomeVar + "incorreto!\n\nDigite um número inteiro.");
        }
        return new Integer(entrada);
    }
    public static void main(String[] args){
        MinhaInterface painel = new MinhaInterface();
        String nome, entrada;
        int x,y;

        nome = JOptionPane.showInputDialog("Entre com seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá " + nome + " ! Bem-vindo(a)!");
        JOptionPane.showMessageDialog(null, "Vamos fazer uma soma rapida, ok?");
        x = painel.inteiroValido("x");
        y = painel.inteiroValido("y");
        JOptionPane.showMessageDialog(null, " x + y = " + x+ " + "+ y+ " = " + (x+y));
        JOptionPane.showMessageDialog(null, "Até mais " + nome + "! \n\nFIM");
    }
}
