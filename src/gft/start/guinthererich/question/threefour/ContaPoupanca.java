package gft.start.guinthererich.question.threefour;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Titular titular) {
        super(titular);
    }

    @Override
    public void rendimento() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void depositar(double valor) {
        super.depositar((valor*0.05)+valor);
    }

    @Override
    public void calcularImposto() {
        System.out.println("O imposto é de: " + super.saldo*0.10);
    }
}
