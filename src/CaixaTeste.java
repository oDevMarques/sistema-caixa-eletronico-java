public class CaixaTeste {
    public static void main(String[] args) {
        CaixaEletronico caixa1 = new CaixaEletronico(5000.00, 10.00);
        Conta conta1 = new Conta("AnthonyMarques", "Tony", "010101", 800.00);
        caixa1.exibirMenu(conta1);


    }

}
