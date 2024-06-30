public class Main {
    public static void main(String[] args){
        // iniciar loop
            // le algo
            // criar um objeto
            // inserir o que eu li no objeto
            // inserior o objeto em uma lista
        // fim do loop
        boolean executa = true;
        int contador = 0;
        while(executa) {

            String dado = leDados.leDados(); // le algo
            System.out.println(dado);

            if (contador == 3) {
                executa = false;
                System.out.println("Saiu");
            }
            contador ++;
        }
        // inicio percorrer lista
            // imprirmir ou manipular dados da lista
        // finalizar percorrer lista
    }
}
