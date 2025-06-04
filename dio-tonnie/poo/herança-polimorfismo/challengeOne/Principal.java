import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do filme:");
        String nomeFilme = scanner.nextLine();

        System.out.println("Informe o valor do ingresso:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 


        System.out.println("Qual o tipo de ingresso? (1 - Normal, 2 - Meia Entrada, 3 - Ingresso Família):");
        int tipo = scanner.nextInt();

        Ingresso ingresso = null;

        switch (tipo) {
            case 1:
                ingresso = new Ingresso(valor, nomeFilme) {
                    @Override
                    public double getValorReal() {
                        return getValor();
                    }
                };
                break;
            case 2:
                ingresso = new MeiaEntrada(valor, nomeFilme);
                break;
            case 3:
                System.out.println("Informe o número de pessoas:");
                int numeroPessoas = scanner.nextInt();
                ingresso = new IngressoFamilia(valor, nomeFilme, numeroPessoas);
                break;
            default:
                System.out.println("Tipo inválido!");
                scanner.close();
                return;
        }

        System.out.println("Resumo do ingresso:");
        System.out.println(ingresso);

        scanner.close();
    }
}
