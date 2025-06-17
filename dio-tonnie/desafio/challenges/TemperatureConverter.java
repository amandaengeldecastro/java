import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();

            if (celsius >= -273.15) {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.1f%n", fahrenheit);
            } else {
                System.out.println("Entrada invalida");
            }
        } else {
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}
