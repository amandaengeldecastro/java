import java.util.Scanner;

@FunctionalInterface
interface FiguraGeometrica {
    double calcularArea();
}

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a figura: 1-Quadrado, 2-Retângulo, 3-Círculo");
        int figura = sc.nextInt();

        FiguraGeometrica figuraSelecionada;

        switch (figura) {
            case 1 -> {
                System.out.println("Digite o lado do quadrado:");
                double lado = sc.nextDouble();
                figuraSelecionada = () -> lado * lado;
            }
            case 2 -> {
                System.out.println("Digite a base do retângulo:");
                double base = sc.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double altura = sc.nextDouble();
                figuraSelecionada = () -> base * altura;
            }
            case 3 -> {
                System.out.println("Digite o raio do círculo:");
                double raio = sc.nextDouble();
                figuraSelecionada = () -> Math.PI * raio * raio;
            }
            default -> {
                System.out.println("Figura inválida.");
                figuraSelecionada = () -> 0.0;
            }
        }

        double area = figuraSelecionada.calcularArea();
        System.out.println("Área calculada: " + area);

        sc.close();
    }
}
