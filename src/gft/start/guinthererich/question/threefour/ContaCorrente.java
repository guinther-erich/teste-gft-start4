package gft.start.guinthererich.question.threefour;

public class ContaCorrente extends Conta {

    public ContaCorrente(Titular titular) {
        super(titular);
    }

    @Override
    public void rendimento() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void depositar(double valor) {
        super.depositar((valor*0.03)+valor);
    }

    @Override
    public void calcularImposto() {
        System.out.println("O imposto é de: " + super.saldo*0.25);
    }
}
