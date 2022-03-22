package gft.start.guinthererich.question.threefour;

public abstract class Conta implements IImposto {

    protected int conta;
    protected double saldo;
    protected Titular titular;

    public Conta(Titular titular) {
        this.titular = titular;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void calcularImposto() {
        saldo += saldo;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.titular.getNome());
        System.out.printf("Conta: %d%n", this.conta);
        System.out.printf("Seu saldo é: %.2f%n", this.saldo);
    }

}
