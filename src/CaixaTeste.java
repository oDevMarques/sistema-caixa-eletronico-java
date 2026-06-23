public class CaixaTeste {
    public static void main(String[] args) {
        CaixaEletronico caixa1 = new CaixaEletronico(5000.00, 10.00);
        System.out.println("Saldo do caixa; " + caixa1.saldoDisponivel);
        System.out.println("Valor mínimo; " + caixa1.valorMinimoSaque);
        System.out.println("Está ocupado? " + caixa1.ocupado);
        Conta conta1 = new Conta("AnthonyMarques", "Tony", "010101", 800.00);
        System.out.println("Titular:" + conta1.titular);
        System.out.println("Login:" + conta1.login);
        System.out.println("Saldo:" + conta1.saldo);
        System.out.println("Tentativas:" + conta1.tentativas);
        System.out.println("Bloqueada?" + conta1.bloqueada);
        boolean resultado1 = conta1.verificarSenha("000000");
        System.out.println("Resultado:" + resultado1);
        System.out.println("Tentativas:" + conta1.tentativas);
        boolean resultado2 = conta1.verificarSenha("122222");
        System.out.println("Resultado:" + resultado2);
        System.out.println("Tentativas:" + conta1.tentativas);
        boolean resultado3 = conta1.verificarSenha("989898");
        System.out.println("Resultado:" + resultado3);
        System.out.println("Tentativas:" + conta1.tentativas);
        System.out.println("Bloqueada?" + conta1.bloqueada);
        boolean resultadoSaque = conta1.sacar(200.00, caixa1);
        System.out.println("Saque efetuado: " + resultadoSaque);
        System.out.println("Saldo após saque: " + conta1.saldo);
        caixa1.exibirMenu(conta1);


    }

}
