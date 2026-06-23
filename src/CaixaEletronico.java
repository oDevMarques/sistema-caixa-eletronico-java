public class CaixaEletronico {
    double saldoDisponivel;
    double valorMinimoSaque;
    boolean ocupado;

    public CaixaEletronico(double saldoDisponivel, double valorMinimoSaque) {
        this.saldoDisponivel = saldoDisponivel;
        this.valorMinimoSaque = valorMinimoSaque;
        this.ocupado = false;
    }
}