public class Conta {
    String titular;
    String login;
    String senha;
    double saldo;
    int tentativas;
    boolean bloqueada;

    public Conta(String titular, String login, String senha, double saldo) {
        this.titular = titular;
        this.login = login;
        this.senha = senha;
        this.saldo = saldo;
        this.tentativas = 0;
        this.bloqueada = false;
    }

    public boolean verificarSenha(String senhaDigitada) {
        if (senhaDigitada.equals(senha)) {
            return true;
        } else {
            tentativas = tentativas + 1;
            if (tentativas == 3) {
                bloqueada = true;
            }
            return false;
        }
    }

    public boolean sacar(double saldoDigitado, CaixaEletronico caixa) {
        if (bloqueada){
            System.out.println("Conta bloqueada.");
            return false;
        }
        if (saldoDigitado < caixa.valorMinimoSaque){
            return false;
        } else if (saldoDigitado <= saldo) {
           saldo = saldo - saldoDigitado;
            return true;
        } else {
            System.out.println("Saldo incompatível.");
            return false;
        }
    }
    public void depositar(double totalDeposito) {
        saldo = saldo + totalDeposito;

    }
}

