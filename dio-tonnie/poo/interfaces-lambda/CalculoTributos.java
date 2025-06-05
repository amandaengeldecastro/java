import java.util.Scanner;

@FunctionalInterface
interface Produto {
    double calcularImposto(double preco);
}

public class CalculoTributos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto alimentacao = preco -> preco * 0.01;
        Produto saudeBemEstar = preco -> preco * 0.015;
        Produto vestuario = preco -> preco * 0.025;
        Produto cultura = preco -> preco * 0.04;

        System.out.println("Digite o preço do produto:");
        double preco = sc.nextDouble();

        System.out.println("Escolha o tipo de produto: 1-Alimentação, 2-Saúde e Bem Estar, 3-Vestuário, 4-Cultura");
        int tipo = sc.nextInt();

        Produto produtoSelecionado = switch (tipo) {
            case 1 -> alimentacao;
            case 2 -> saudeBemEstar;
            case 3 -> vestuario;
            case 4 -> cultura;
            default -> p -> {
                System.out.println("Tipo inválido.");
                return 0.0;
            };
        };

        double imposto = produtoSelecionado.calcularImposto(preco);
        System.out.println("Valor do imposto: R$" + imposto);

        sc.close();
    }
}
