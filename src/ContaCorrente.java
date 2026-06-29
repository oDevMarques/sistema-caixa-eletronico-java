public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String titular, String login, String senha, double saldo, double limite) {
        super(titular, login, senha, saldo);
        this.limite = limite;
    }

    public boolean sacar(double saldoDigitado, CaixaEletronico caixa) {
        if (saldoDigitado <= getSaldo() + limite) {

            setSaldo(getSaldo() - saldoDigitado);
            return true;

        } else {
            System.out.println("Saldo Incompativel.");
            return false;
        }
    }
}
