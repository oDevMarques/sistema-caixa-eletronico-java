import java.util.Scanner;
public class CaixaEletronico {
    double saldoDisponivel;
    double valorMinimoSaque;
    boolean ocupado;

    Conta[] contas = new Conta[4];

    public CaixaEletronico(double saldoDisponivel, double valorMinimoSaque) {
        this.saldoDisponivel = saldoDisponivel;
        this.valorMinimoSaque = valorMinimoSaque;
        this.ocupado = false;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean autenticado = false;

        while (!autenticado) {
            System.out.println("Digite seu login: ");
            String loginDigitado = scanner.next();
            Conta contaEncontrada = null;


            for (int i = 0; i < contas.length; i++) {
                if (contas[i] != null && contas[i].getLogin().equals(loginDigitado)) {
                    contaEncontrada = contas[i];
                }
            }

            if (contaEncontrada != null) {
                System.out.println("Ola insira sua senha:");
                String senhaDigitada = scanner.next();

                if (contaEncontrada.verificarSenha(senhaDigitada)) {
                    autenticado = true;

                    int opcao = 0;
                    while (opcao != 5) {
                        System.out.println("=== CAIXA ELETRÔNICO ===");
                        System.out.println("1 - Verificar saldo");
                        System.out.println("2 - Sacar");
                        System.out.println("3 - Depositar");
                        System.out.println("4 - Extrato");
                        System.out.println("5 - Sair");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.println("Saldo: " + contaEncontrada.getSaldo());
                                break;
                            case 2:
                                System.out.println("Digite o valor: ");
                                double valor = scanner.nextDouble();
                                boolean sacou = contaEncontrada.sacar(valor, this);
                                if (sacou) {
                                    System.out.println("Saque realizado! Saldo atual: " + contaEncontrada.getSaldo());
                                }

                                break;
                            case 3:
                                double totalDeposito = 0;
                                double nota = 0;
                                System.out.println("=== DEPÓSITO ===");
                                while (nota != -1) {
                                    System.out.println("Digite o valor da nota (ou -1 para finalizar):");
                                    nota = scanner.nextDouble();
                                    if (nota != -1) {
                                        totalDeposito = totalDeposito + nota;
                                        System.out.println("Total insrido: " + totalDeposito);
                                    }
                                }
                                contaEncontrada.depositar(totalDeposito);
                                System.out.println("Depósito realizado! Saldo atual: " + contaEncontrada.getSaldo());
                                break;
                            case 4:
                                contaEncontrada.verExtrato();
                                break;
                            case 5:
                                System.out.println("Encerrando...");
                                break;
                        }
                    }
                } else {
                    System.out.println("Senha invalida, Tente novamente.");

                }
            } else {
                System.out.println("Login inválido, Tente novamente.");
            }


        }
    }
}


