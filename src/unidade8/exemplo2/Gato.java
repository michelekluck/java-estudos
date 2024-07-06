package unidade8.exemplo2;

public class Gato extends Mamifero {

    private static final long serialVesionUID = 1L;

    @Override
    public String soar(){
        return "Faz miados";
    }

    public Gato (String nome, int idade, String dono){
        super(nome, idade, dono, "Gato");
    }
}
