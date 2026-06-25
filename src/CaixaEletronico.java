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

        System.out.println("Digite seu login: ");
        String loginDigitado = scanner.next();

        if (loginDigitado.equals(conta.login)) {
            System.out.println("Ola insira sua senha:");
            String senhaDigitada = scanner.next();
            if (conta.verificarSenha(senhaDigitada)) {
                int opcao = 0;
                while (opcao != 4) {
                    System.out.println("=== CAIXA ELETRÔNICO ===");
                    System.out.println("1 - Verificar saldo");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Depositar");
                    System.out.println("4 - Sair");
                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Saldo: " + conta.saldo);
                            break;
                        case 2:
                            System.out.println("Digite o valor: ");
                            double valor = scanner.nextDouble();
                            boolean sacou = conta.sacar(valor, this);
                            if (sacou) {
                                System.out.println("Saque realizado! Saldo atual: " + conta.saldo);
                            }

                            break;
                        case 3:
                            double totalDeposito = 0;
                            double nota = 0;
                            System.out.println("=== DEPÓSITO ===");
                            while (nota!= -1) {
                                System.out.println("Digite o valor da nota (ou -1 para finalizar):");
                                nota = scanner.nextDouble();
                                if (nota != -1) {
                                    totalDeposito = totalDeposito + nota;
                                    System.out.println("Total insrido: " + totalDeposito);
                                }
                            }
                            conta.depositar(totalDeposito);
                            System.out.println("Depósito realizado! Saldo atual: " + conta.saldo);
                            break;
                        case 4:
                            System.out.println("Encerrando...");
                            break;
                    }
                }
            } else {
                System.out.println("Senha invalida");
            }
        } else {
            System.out.println("Login inválido.");
        }




        }
    }


