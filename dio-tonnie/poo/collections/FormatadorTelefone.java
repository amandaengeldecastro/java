import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class FormatadorTelefone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de telefone:");
        String entrada = scanner.nextLine();

        String resultado = formatarTelefone(entrada);
        System.out.println(resultado);

        scanner.close();
    }

    private static String formatarTelefone(String entrada) {
        String numeros = entrada.replaceAll("\\D", "");

        if (numeros.length() == 8) { // Without DDD
            return "Telefone fixo: " + numeros.substring(0, 4) + "-" + numeros.substring(4);
        } else if (numeros.length() == 10) { 
            return "Telefone fixo: (" + numeros.substring(0, 2) + ")" + numeros.substring(2, 6) + "-" + numeros.substring(6);
        } else if (numeros.length() == 9) { // Without DDD
            return "Celular: " + numeros.substring(0, 5) + "-" + numeros.substring(5);
        } else if (numeros.length() == 11) { 
            return "Celular: (" + numeros.substring(0, 2) + ")" + numeros.substring(2, 7) + "-" + numeros.substring(7);
        } else {
            return "Número inválido";
        }
    }
}
