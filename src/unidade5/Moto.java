package unidade5;

// moto é subclasse de veiculo
// veiculo é uma superclasse partir de caminhão e de moto
// moto é uma especialização de veiculo
// implements -> classe deve obrigatoriamente implementar as funções do usuario
public class Moto extends Veiculo implements FuncoesUsuario{
    // atributos
    private  int cilindradas;

    // construtor
    public Moto(String marcaDaMoto, String motorDaMoto, int cilindradas){
        super(marcaDaMoto, motorDaMoto);
        this.cilindradas = cilindradas;
    }

    // metodos
    public int getCilindradas(){
        return this.cilindradas;
    }

    public void getDetalhes(){
        System.out.println("A moto tem " + this.cilindradas + " cilindradas");
    }

    // implementações do arquivo FuncoesUsuario
    public void mostrarResumoVeiculo(){
        System.out.println("Esta é uma mensagem aleatoria de resumo do veiculo.");
    }

    public int mostrarIdadeVeiculo(){
        return 1;
    }

    public String retornarMensagemResumoVeiculo(){
        return "Mensagem aleatoria de resumo.";
    }
}
