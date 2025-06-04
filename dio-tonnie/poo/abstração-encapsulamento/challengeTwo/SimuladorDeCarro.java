import java.util.Scanner;

public class SimuladorDeCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Bem-vindo ao Simulador de Carro!");
        String opcao;

        do {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Trocar Marcha");
            System.out.println("6 - Virar à Esquerda");
            System.out.println("7 - Virar à Direita");
            System.out.println("8 - Verificar Velocidade");
            System.out.println("9 - Verificar Marcha");
            System.out.println("0 - Sair");

            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    carro.ligar();
                    break;
                case "2":
                    carro.desligar();
                    break;
                case "3":
                    carro.acelerar();
                    break;
                case "4":
                    carro.desacelerar();
                    break;
                case "5":
                    System.out.print("Digite a nova marcha (0-6): ");
                    int marcha = Integer.parseInt(scanner.nextLine());
                    carro.trocarMarcha(marcha);
                    break;
                case "6":
                    carro.virar("esquerda");
                    break;
                case "7":
                    carro.virar("direita");
                    break;
                case "8":
                    carro.verificarVelocidade();
                    break;
                case "9":
                    carro.verificarMarcha();
                    break;
                case "0":
                    System.out.println("Saindo do Simulador de Carro...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals("0"));

        scanner.close();
    }
}
