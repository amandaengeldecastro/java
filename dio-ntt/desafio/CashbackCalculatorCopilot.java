import java.util.Scanner;

public class CashbackCalculatorCopilot {
    /*
     * Você está corrigindo o código de um sistema de e-commerce que calcula o valor
     * final de um pedido, considerando desconto por cupom e cashback. O código
     * atual está com erros de lógica e sintaxe, e sua missão é identificar e
     * corrigir esses erros para garantir que os valores sejam calculados
     * corretamente.
     * 
     * Regras de negócio:
     * Se o cupom inserido for "DESC10", aplicar 10% de desconto sobre o valor dos
     * produtos.
     * Se o valor dos produtos com desconto for maior ou igual a R$150, o cliente
     * recebe R$15 de cashback.
     * O valor final do pedido é: valor com desconto - cashback.
     * 💡 Uma opção para te ajudar durante o processo de depuração é o uso do GitHub
     * Copilot, que pode sugerir correções de código.
     * 
     * Entrada:
     * A entrada é composta por dois valores:
     * double productsValue: valor total dos produtos comprados.
     * String couponCode: código do cupom inserido pelo cliente.
     * 
     * Saída:
     * Exibir o valor final do pedido, com duas casas decimais, e o valor de
     * cashback, se houver.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double productsValue = scan.nextDouble();
        scan.nextLine(); // Consumir a quebra de linha
        String couponCode = scan.nextLine();

        double discount = 0;
        double cashback = 0;

        // Corrigir comparação de string
        if (couponCode.equals("DESC10")) {
            discount = productsValue * 0.10;
        }

        double discountedValue = productsValue - discount;

        if (discountedValue >= 150.00) {
            cashback = 15.0;
        }

        double finalValue = discountedValue - cashback;

        System.out.printf("Valor final: R$ %.2f | Cashback: R$ %.2f\n", finalValue, cashback);

        scan.close();
    }
}