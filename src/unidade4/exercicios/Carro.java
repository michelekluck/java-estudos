package unidade4.exercicios;
/*Crie uma classe carro com atributos para "marca", "modelo", "ano" e "placa".
 Em seguida, crie uma classe MotoristaUber que possui um objeto carro como um de seus atributos,
 além de atributos para "nome" e "idMotorista". Crie métodos para definir e obter esses atributos.*/

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    // getters
    public String getMarca(){
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getPlaca(){
        return this.placa;
    }

    // setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString(){
        return "Carro [Marca = " + marca + ", Modelo = " + modelo + ", Ano = " + ano + ", Placa = " + placa + "]";
    }
}

class MotoristaUber {
    private String nome;
    private String idMotorista;
    private Carro carro;

    public MotoristaUber(String nome, String idMotorista, Carro carro) {
        this.nome = nome;
        this.idMotorista = idMotorista;
        this.carro = carro;
    }

    //getters
    public String getNome(){
        return this.nome;
    }

    public String getIdMotorista(){
        return this.idMotorista;
    }

    public Carro getCarro(){
        return this.carro;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdMotorista(String idMotorista) {
        this.idMotorista = idMotorista;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String toString(){
        return "Motorista [Nome = " + nome + ", ID = " + idMotorista + ", Carro = " + carro.toString() + "]";
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Renault","Kwid Branco", 2023, "ABC-1234");
        MotoristaUber motorista = new MotoristaUber("João", "M1234", carro);

        System.out.println(motorista);

        motorista.setNome("José");
        motorista.getCarro().setModelo("Sandero");

        System.out.println(motorista);
    }
}


