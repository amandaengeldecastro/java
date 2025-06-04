import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println("\n============");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.print("Digite o valor para saque: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    double boleto = sc.nextDouble();
                    conta.pagarBoleto(boleto);
                    break;
                case 6:
                    System.out.println("Usando cheque especial? " + conta.estaUsandoChequeEspecial());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
