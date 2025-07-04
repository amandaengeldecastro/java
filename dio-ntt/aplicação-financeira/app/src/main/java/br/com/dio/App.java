package br.com.dio;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.dio.exception.AccountNotFoundException;
import br.com.dio.exception.InvalidArgumentException;
import br.com.dio.exception.NoFundsEnoughtException;
import br.com.dio.exception.PixInUseException;
import br.com.dio.model.MoneyAudit;
import br.com.dio.repository.AccountRepository;
import br.com.dio.repository.InvestmentRepository;

public class App {

    static Scanner scanner = new Scanner(System.in);
    private final static AccountRepository accountRepository = new AccountRepository();
    private final static InvestmentRepository investmentRepository = new InvestmentRepository();

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Seja bem-vindo(a) ao DIOBank!");
        System.out.println("Selecione a opção desejada!");

        while (true) {
            System.out.println("========================================");
            System.out.println("1  - Criar uma conta");
            System.out.println("2  - Criar um investimento");
            System.out.println("3  - Fazer um investimento");
            System.out.println("4  - Depositar na conta");
            System.out.println("5  - Sacar da conta");
            System.out.println("6  - Transferir entre contas");
            System.out.println("7  - Investir");
            System.out.println("8  - Sacar investimento");
            System.out.println("9  - Listar contas");
            System.out.println("10 - Listar investimento");
            System.out.println("11 - Listar carteiras de investimento");
            System.out.println("12 - Atualizar investimento");
            System.out.println("13 - Historico de conta");
            System.out.println("14 - Sair");
            System.out.println("========================================");

            var option = scanner.nextInt();
            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    createInvestment();
                    break;
                case 3:
                    createWalletInvestment();
                    break;
                case 4:
                    deposit();
                    break;
                case 5:
                    withdraw();
                    break;
                case 6:
                    transferToAccount();
                    break;
                case 7:
                    incInvestment();
                    break;
                case 8:
                    rescueInvestment();
                    break;
                case 9:
                    accountRepository.list().forEach(System.out::println);
                    break;
                case 10:
                    investmentRepository.list().forEach(System.out::println);
                    break;
                case 11:
                    investmentRepository.listWallets().forEach(System.out::println);
                    break;
                case 12: {
                    investmentRepository.updateAmount();
                    System.out.println("Investimento atualizado com sucesso!");
                    break;
                }
                case 13:
                    checkHistory();
                    break;
                case 14:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

    private static void createAccount() {
        try {
            System.out.println("Digite as chaves pix que deseja cadastrar (separadas por ponto&virgula - ';'):");
            var input = scanner.next();

            String regex = "^[a-zA-Z0-9]+(?:;[a-zA-Z0-9]+)*$";

            if (!input.matches(regex)) {
                System.out.println(
                        "Erro: A(s) chave(s) Pix devem ser alfanuméricas e, se houver mais de uma, devem ser separadas por ponto e vírgula (';').");
                return; 
            }

            var pix = Arrays.stream(input.split(";")).toList();
            System.out.println("Digite o valor inicial de depósito:");
            var amount = scanner.nextLong();
            var wallet = accountRepository.create(pix, amount);
            System.out.println("Chave(s) pix: " + wallet.getPix() + " criada(s) com sucesso!");

        } catch (PixInUseException e) {
            System.out.println(e.getMessage() + " Tente novamente com uma chave Pix diferente.");
        }
    }

    private static void createInvestment() {
        int tax;
        long initialFunds;

        try {
            System.out.println("Digite a taxa de investimento:");
            tax = scanner.nextInt();
        } catch (InvalidArgumentException e) {
            System.out.println("Erro: A taxa de investimento deve ser um número inteiro.");
            scanner.nextLine(); 
            return;
        }

        System.out.println("Digite o valor inicial de depósito:");
        try {
            initialFunds = scanner.nextLong(); 
        } catch (Exception e) {
            System.out.println("Erro: O valor do depósito deve ser um número válido.");
            scanner.nextLine(); 
            return; 
        }

        var investiment = investmentRepository.create(tax, initialFunds);
        System.out.println("Investimento de id " + investiment.id() + " no valor de R$" + investiment.initialFunds()
                + " com taxa de " + investiment.tax() + "%" + ", criado com sucesso!");
    }

    private static void createWalletInvestment() {
        System.out.println("Digite a chave pix da conta de origem:");
        var pix = scanner.next();

        // Regex para garantir que a chave Pix não contenha caracteres especiais
        String regex = "^[a-zA-Z0-9]+$"; // Apenas letras e números, sem caracteres especiais.

        // Validar se a chave Pix não contém caracteres especiais
        if (!pix.matches(regex)) {
            System.out.println("Erro: A chave Pix não pode conter caracteres especiais!");
            return; // Retorna ao menu principal
        }

        // Verificar se a chave Pix existe na base de dados
        var account = accountRepository.findByPix(pix);
        if (account == null) {
            System.out.println("Erro: Conta não encontrada para a chave Pix informada.");
            return; // Retorna ao menu principal
        }

        System.out.println("Digite o identificador do investimento:");
        int investimentId;
        try {
            investimentId = scanner.nextInt(); // Ler o identificador do investimento
            var investmentWallet = investmentRepository.initInvestment(account, investimentId);
            System.out.println("Carteira de investimento " + investmentWallet + " criada com sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro: Identificador de investimento inválido.");
            scanner.nextLine(); // Limpar o buffer do scanner para evitar loop infinito
        }
    }

    public static void checkHistory() {
        System.out.println("Digite a chave pix da conta que deseja consultar o extrato:");
        var pix = scanner.next();

        System.out.println("Escolha o período do extrato:");
        System.out.println("1 - Extrato do dia");
        System.out.println("2 - Últimos 30 dias");
        var option = scanner.nextInt();

        OffsetDateTime start;
        OffsetDateTime end;

        switch (option) {
            case 1 -> {
                end = OffsetDateTime.now();
                start = end.toLocalDate().atStartOfDay().atOffset(end.getOffset());
            }
            case 2 -> {
                end = OffsetDateTime.now();
                start = end.minusDays(30);
            }
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }

        try {
            var history = accountRepository.getHistory(pix);

            var filtered = history.entrySet().stream()
                    .filter(entry -> !entry.getKey().isBefore(start) && !entry.getKey().isAfter(end))
                    .collect(Collectors.toList());

            if (filtered.isEmpty()) {
                System.out.println("Nenhuma transação encontrada no período selecionado.");
            } else {
                filtered.forEach((Map.Entry<OffsetDateTime, List<MoneyAudit>> entry) -> {
                    String timestamp = entry.getKey().truncatedTo(ChronoUnit.SECONDS).toString();
                    String details = entry.getValue().stream()
                            .map(MoneyAudit::description)
                            .collect(Collectors.joining(", "));
                    System.out.println(timestamp + " - " + details);
                });
            }

        } catch (AccountNotFoundException e) {
            System.out.println("Erro ao consultar o histórico: " + e.getMessage());
        }
    }

    private static void rescueInvestment() {
        System.out.println("Digite a chave pix da conta que deseja realizar o resgate:");
        var pix = scanner.next();
        System.out.println("Digite o valor do resgate:");
        var amount = scanner.nextLong();
        try {
            investmentRepository.withdraw(pix, amount);
        } catch (NoFundsEnoughtException | AccountNotFoundException e) {
            System.out.println("Erro ao realizar o resgate: " + e.getMessage());
        }
    }

    private static void incInvestment() {
        System.out.println("Digite a chave pix da conta que deseja realizar o investimento:");
        var pix = scanner.next();
        System.out.println("Digite o valor a ser investido:");
        var amount = scanner.nextLong();
        try {

            investmentRepository.deposit(pix, amount);
        } catch (AccountNotFoundException e) {
            System.out.println("Erro ao realizar o investimento: " + e.getMessage());
        }

    }

    private static void deposit() {
        System.out.println("Digite a chave pix da conta que deseja depositar:");
        var pix = scanner.next();
        System.out.println("Digite o valor do depósito:");
        var amount = scanner.nextLong();
        accountRepository.deposit(pix, amount);
    }

    private static void withdraw() {
        System.out.println("Digite a chave pix da conta que deseja sacar:");
        var pix = scanner.next();
        System.out.println("Digite o valor do saque:");
        var amount = scanner.nextLong();
        try {
            accountRepository.withdraw(pix, amount);
        } catch (NoFundsEnoughtException | AccountNotFoundException e) {
            System.out.println("Erro ao realizar o saque: " + e.getMessage());
        }
    }

    private static void transferToAccount() {
        System.out.println("Digite a chave pix da conta de origem:");
        var source = scanner.next();
        System.out.println("Digite a chave pix da conta de destino:");
        var target = scanner.next();
        var amount = scanner.nextLong();
        try {
            accountRepository.transfer(source, target, amount);
        } catch (AccountNotFoundException e) {
            System.out.println("Erro ao realizar a transferência: " + e.getMessage());
        }
    }

}
