package unidade3;

public class Conta {
    private double saldo;
    private String dono;

    public Conta(double saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
