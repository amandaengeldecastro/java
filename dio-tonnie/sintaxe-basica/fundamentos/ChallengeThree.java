import java.util.Scanner;

public class ChallengeThree {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo:");
        var base = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo:");
        var altura = scanner.nextDouble();

        var area = base * altura;

        System.out.println("Fórmula: área = base X altura");
        System.out.printf("A área do retângulo é: %.2f\n", area);

        scanner.close();
    }
}