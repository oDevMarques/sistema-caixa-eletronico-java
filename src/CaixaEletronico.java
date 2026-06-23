import java.util.Scanner;
public class CaixaEletronico {
    double saldoDisponivel;
    double valorMinimoSaque;
    boolean ocupado;

    public CaixaEletronico(double saldoDisponivel, double valorMinimoSaque) {
        this.saldoDisponivel = saldoDisponivel;
        this.valorMinimoSaque = valorMinimoSaque;
        this.ocupado = false;
    }
    public void exibirMenu(Conta conta) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Verificar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + conta.saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor, this);
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
            }


        }
    }

}