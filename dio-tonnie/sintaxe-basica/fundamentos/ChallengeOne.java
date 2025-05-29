import java.time.OffsetDateTime;
import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe seu ano de nascimento:");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá %s, você tem %d anos \n", name, age);
        scanner.close();
    }
}
