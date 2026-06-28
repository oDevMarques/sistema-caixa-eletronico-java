public class CaixaTeste {
    public static void main(String[] args) {
        CaixaEletronico caixa1 = new CaixaEletronico(999999.99, 10.00);
        caixa1.contas[0] = new Conta("Anthony Marques", "Tony", "010101", 5000.00);
        caixa1.contas[1] = new Conta("Lavinia Oliveira", "Lavinia", "020202", 4000.00);
        caixa1.contas[2] = new Conta("Alicia Marques", "Alicia", "030303", 3000.00);
        caixa1.exibirMenu();


    }

}
