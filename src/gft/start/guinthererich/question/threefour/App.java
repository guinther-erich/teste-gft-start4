package gft.start.guinthererich.question.threefour;

public class App {
    public static void main(String[] args) {
        Titular novoTitular = new Titular();
        novoTitular.setNome("Guinther Erich");

        Conta cc = new ContaCorrente(novoTitular);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(novoTitular);
        cp.depositar(100);

        cc.rendimento();
        cc.calcularImposto();

        cp.rendimento();
        cp.calcularImposto();
    }

}
