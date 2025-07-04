import java.util.Scanner;
import java.util.Locale;

public class EcommerceSpendingTracker {
    /* Você está desenvolvendo um sistema simples para um e-commerce que deseja registrar os valores das compras realizadas por um cliente ao longo de um único dia. O sistema deve primeiro receber a quantidade total de compras realizadas e, em seguida, solicitar o valor de cada uma dessas compras. Ao final, o sistema deve exibir o total gasto no dia e a média de valor por compra.
        Entrada:
        A entrada deve receber:
        Um número inteiro N que indica a quantidade de compras realizadas no dia.
        Em seguida, N números do tipo double, cada um representando o valor de uma compra.

        Saída:
        O programa deverá retornar:
        O total das compras com duas casas decimais
        A média de valor por compra com duas casas decima
        Se N for 0 (ou seja, nenhuma compra registrada), o programa deverá exibir: "Nenhuma compra registrada."
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            // TODO: Leia os valores das compras e calcule a média
            for (int i=0; i < purchaseCount; i++){
                 totalSpent += scanner.nextDouble();
            }

            double average = totalSpent / purchaseCount;

            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", average); // TODO: Imprima a média
        }

        scanner.close();
    }
}