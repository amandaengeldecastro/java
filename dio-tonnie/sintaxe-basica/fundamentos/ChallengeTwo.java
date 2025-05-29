import java.time.OffsetDateTime;
import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado:");
        var lado = scanner.nextDouble();

        var area = lado * lado;
        System.out.println("Fórmula: área = lado X lado");
        System.out.printf("A área do quadrado é: %.2f\n", area);

        scanner.close();
    }
}