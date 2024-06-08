package unidade4;

public class Dono {
    // atributos
    private String nome;
    private Cao[] pets;

    // metodo construtor
    public Dono(String nome) {
        this.nome = nome;
        pets = new Cao[3];
    }

    public void addPet(int index, Cao pet) {
        this.pets[index] = pet;
    }

    // metodo getter = retorna o valor do atributo
    public Cao getPet(int index) {
        return this.pets[index];
    }

    // metodo
    public void alimentarCaes() {
        for(int i =0; i < 3; i++){
            this.pets[i].realizarRefeicao();
        }
    }

    // metodo
    public void receberFesta() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.nome + " está recebendo festa de " + this.pets[i].getNomeCao());
        }
    }

    public void listarCaes(){
        for(int i = 0; i < 3; i++){
            this.getPet(i).printCao();
        }
    }

    // metodo principal
    public static void main(String[] args) {
        Dono maria = new Dono("Maria"); // cria um novo objeto dono chamado maria
        Cao pipoca = new Cao("Pipoca", "Beagle", "Femea", 3, "Enrolada", "Pelo curtinho");
        // cria um novo objeto cao chamado pipoca
        Cao bruce = new Cao("Bruce", "Pug", "Macho", 2, "Caracol", "Pelo curtinho");
        Cao jujuba = new Cao("Jujuba", "Maltês", "Femea", 1, "Enrolada", "Pelo longo");

        maria.addPet(0, pipoca);
        maria.addPet(1, bruce);
        maria.addPet(2, jujuba);

        pipoca.setMeuDono(maria); // associa Pipoca com Maria
        bruce.setMeuDono(maria);
        jujuba.setMeuDono(maria);

        System.out.println("Cãozinho de "+ maria.nome);
        maria.listarCaes();

        maria.alimentarCaes(); // Maria alimenta sua cão Pipoca
        maria.receberFesta();
    }
}
