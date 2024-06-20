package unidade5.exercicio.banco;
/*Crie uma classe ContaBancaria com atributos privados como saldo e
numeroDaConta. Crie uma classe ContaCorrente que herda de ContaBancaria e
adiciona um atributo limiteDeCredito. Certifique-se de usar protected ou private
 corretamente para encapsular os atributos.*/

// superclasse ContaBancaria
 class ContaBancaria {
     // atributos
    protected double saldo; // o protected deixa o atributo visivel para: class, package e subclasse
    // usamos protected aqui porque queremos usar o atributo saldo em outra classe
    private final String numeroDaConta; // o private deixa o atributo visivel apenas na propria classe

    // metodo construtor
    public ContaBancaria(String numeroDaConta, double saldoInicial){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }

    // getters
     public String getNumeroDaConta() {
         return this.numeroDaConta;
     }

     public double getSaldo(){
        return this.saldo;
     }

     // metodo depositar
    // se o valor for maior que 0 -> vai somar o saldo mais o valor
    // se não -> aparece na tela que o valor é invalido para deposito
    // pois o valor para se depositar precisa ser positivo
     public void depositar(double valor){
        if (valor > 0) {
            this.saldo +=  valor;
        } else {
            System.out.println("Valor inválido para depósito");
        }
     }

     // método sacar
    // se o valor for maior que o saldo -> aparece na tela que o saldo é insuficiente para saque
    // porque o valor para se sacar não pode ser maior que o saldo
    // se não -> vai fazer o valor do saldo menos o valor
    // porque foi retirado valor do saldo ou seja, diminuiu o valor do saldo
     public void sacar (double valor){
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            this.saldo -= valor;
        }
     }

 }

 // subclasse de ContaBancaria
class ContaCorrente extends ContaBancaria{
     // atributo especifico da subclasse ContaCorrente
    private final double limiteDeCredito; // private quer dizer que apenas as instancias da classe podem visualiza-la e depois de inicializada seu valor não pode ser modificado

     // metodo construtor - coloco como parametros os atributos da superclasse e a da subclasse
    public ContaCorrente(String numeroDaConta, double saldoInicial, double limiteDoCredito){
        super(numeroDaConta, saldoInicial); // chama o construtor da superclasse ContaBancaria e seus dois parametros
        this.limiteDeCredito = limiteDoCredito; // o this chama o construtor da classe
    }

    // getter do atributo limiteDeCredito
    public double getLimiteDeCredito(){
        return this.limiteDeCredito;
    }

    // override = redefine o método sacar da superclaase ContaBancaria
    @Override
    // se o valor for maior que o saldo + o limite de credito -> aparece na tela que o saldo é insuficiente para saque
    // porque não conseguimos sacar mais do que temos
    // se não -> tiro o valor declarado do saldo porque sacamos esse dinheiro
    public void sacar(double valor){
        if (valor > saldo + limiteDeCredito) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= valor;
        }
    }
}

// método principal
public class Main {
    public static void main(String[] args){
        // cria um novo objeto chamado conta, da subcalsse ContaCorrente e declaramos o numero da conta, o saldo inicial e o limite do credito desse objeto
        ContaCorrente conta = new ContaCorrente("12345-6", 1000, 500);
        // imprimimos na tela o saldo do objeto conta -> 1000 (declaramos acima)
        System.out.println("Saldo inicial: " + conta.getSaldo());
        // imprimimos na tela o limite de credito do objeto conta -> 500 (declaramos acima)
        System.out.println("Limite de crédito: " + conta.getLimiteDeCredito());

        // crio duas variaveis, uma chamada deposito que vai armazenar o valor 500
        double deposito = 500.0;
        // e outra chamada saque que armazena o valor 1500
        double saque = 1500.0;

        // imprimimos na tela a variavel declarada acima -> 500
        System.out.println("Depositando: " + deposito);

        // solicitamos para que o objeto conta execute o método depositar usando o valor deposito (500)
        // esse método soma o valor do saldo mais o valor depositado -> 1500
        conta.depositar(deposito);
        // imprimimos na tela o saldo da conta atualizado -> 1500
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        // imprimimos na tela o saque -> 1500
        System.out.println("Sacando: " + saque);
        // solicitamos para que o objeto conta execute o método sacar isando o valor sacado
        conta.sacar(saque);
        // imprimimos na tela o saldo da nossa conta após o saque -> 0
        System.out.println("Saldo após saque exceder o limite: " + conta.getSaldo());
    }
}

