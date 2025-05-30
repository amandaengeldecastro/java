import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();

        System.out.print("Deseja ver os números pares ou ímpares? (par/impar): ");
        String escolha = scanner.next();

        System.out.println("Números no intervalo em ordem decrescente:");

        for (int i = segundo; i >= primeiro; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}