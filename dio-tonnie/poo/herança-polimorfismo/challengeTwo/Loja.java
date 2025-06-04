import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;
        boolean sairPrograma = false;

        while (!sairPrograma) {
            System.out.println("\n=== Login ===");
            System.out.println("Escolha o tipo de usuário:\n1 - Gerente\n2 - Vendedor\n3 - Atendente\n0 - Sair");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            if (tipo == 0) {
                sairPrograma = true;
                System.out.println("Saindo do sistema...");
                break;
            }

            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite o email:");
            String email = scanner.nextLine();

            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();

            switch (tipo) {
                case 1:
                    usuario = new Gerente(nome, email, senha);
                    break;
                case 2:
                    usuario = new Vendedor(nome, email, senha);
                    break;
                case 3:
                    usuario = new Atendente(nome, email, senha);
                    break;
                default:
                    System.out.println("Tipo inválido.");
                    continue;
            }

            usuario.realizarLogin();

            boolean usuarioLogado = true;
            while (usuarioLogado) {
                System.out.println("\nEscolha uma ação:");
                System.out.println("1 - Alterar Dados");
                System.out.println("2 - Alterar Senha");
                System.out.println("3 - Realizar ação específica");
                System.out.println("4 - Fazer logoff");
                System.out.println("5 - Trocar usuário");
                System.out.println("0 - Sair do programa");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Novo nome:");
                        String novoNome = scanner.nextLine();
                        System.out.println("Novo email:");
                        String novoEmail = scanner.nextLine();
                        usuario.alterarDados(novoNome, novoEmail);
                        break;
                    case 2:
                        System.out.println("Nova senha:");
                        String novaSenha = scanner.nextLine();
                        usuario.alterarSenha(novaSenha);
                        break;
                    case 3:
                        if (usuario instanceof Gerente) {
                            Gerente gerente = (Gerente) usuario;
                            boolean voltarGerente = false;
                            while (!voltarGerente) {
                                System.out.println("\nAções do Gerente:");
                                System.out.println("1 - Consultar vendas");
                                System.out.println("2 - Gerar relatório financeiro");
                                System.out.println("0 - Voltar ao menu anterior");
                                int acao = scanner.nextInt();
                                scanner.nextLine();
                                switch (acao) {
                                    case 1:
                                        gerente.consultarVendas();
                                        break;
                                    case 2:
                                        gerente.gerarRelatorioFinanceiro();
                                        break;
                                    case 0:
                                        voltarGerente = true;
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            }
                        } else if (usuario instanceof Vendedor) {
                            Vendedor vendedor = (Vendedor) usuario;
                            boolean voltarVendedor = false;
                            while (!voltarVendedor) {
                                System.out.println("\nAções do Vendedor:");
                                System.out.println("1 - Realizar venda");
                                System.out.println("2 - Consultar vendas");
                                System.out.println("0 - Voltar ao menu anterior");
                                int acao = scanner.nextInt();
                                scanner.nextLine();
                                switch (acao) {
                                    case 1:
                                        vendedor.realizarVenda();
                                        break;
                                    case 2:
                                        vendedor.consultarVendas();
                                        break;
                                    case 0:
                                        voltarVendedor = true;
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            }
                        } else if (usuario instanceof Atendente) {
                            Atendente atendente = (Atendente) usuario;
                            boolean voltarAtendente = false;
                            while (!voltarAtendente) {
                                System.out.println("\nAções do Atendente:");
                                System.out.println("1 - Receber pagamento");
                                System.out.println("2 - Fechar caixa");
                                System.out.println("0 - Voltar ao menu anterior");
                                int acao = scanner.nextInt();
                                scanner.nextLine();
                                switch (acao) {
                                    case 1:
                                        System.out.println("Digite o valor a receber:");
                                        double valor = scanner.nextDouble();
                                        scanner.nextLine();
                                        atendente.receberPagamento(valor);
                                        break;
                                    case 2:
                                        atendente.fecharCaixa();
                                        break;
                                    case 0:
                                        voltarAtendente = true;
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Deseja realmente fazer logoff? (s/n)");
                        String resp = scanner.nextLine();
                        if (resp.equalsIgnoreCase("s")) {
                            usuario.realizarLogoff();
                            usuarioLogado = false;
                        } else {
                            System.out.println("Usuário permaneceu logado.");
                        }
                        break;
                    case 5:
                        System.out.println("Trocando de usuário...");
                        usuario.realizarLogoff();
                        usuarioLogado = false;
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        usuario.realizarLogoff();
                        usuarioLogado = false;
                        sairPrograma = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
