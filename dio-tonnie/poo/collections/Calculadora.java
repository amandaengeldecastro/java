import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os números separados por vírgula:");
        String input = scanner.nextLine();

        System.out.println("Informe a operação (soma/subtracao):");
        String operacao = scanner.nextLine().toLowerCase();

        String[] numerosStr = input.split(",");
        double resultado = 0;

        try {
            if (operacao.equals("soma")) {
                resultado = 0;
                for (String numStr : numerosStr) {
                    resultado += Double.parseDouble(numStr.trim());
                }
            } else if (operacao.equals("subtracao")) {
                resultado = Double.parseDouble(numerosStr[0].trim());
                for (int i = 1; i < numerosStr.length; i++) {
                    resultado -= Double.parseDouble(numerosStr[i].trim());
                }
            } else {
                System.out.println("Operação inválida!");
                scanner.close();
                return;
            }
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida de número.");
        }

        scanner.close();
    }
}
