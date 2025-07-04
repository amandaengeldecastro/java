import java.util.Scanner;

public class AccessControl {
    /*
     * Uma biblioteca está implementando um sistema automatizado para liberar o
     * acesso à área de livros raros. O sistema deve permitir a entrada apenas para
     * visitantes autorizados e com idade mínima de 18 anos. Para isso, é necessário
     * utilizar operadores lógicos, estruturas condicionais (if, else, else if) e
     * conceitos básicos como tipos primitivos e palavras-chave. Desenvolva um
     * programa que verifique se o visitante pode acessar a sala especial.
     * Entrada:
     * O programa deve receber os seguintes valores:
     * Um valor booleano indicando se o visitante possui autorização (true ou false)
     * Um número inteiro representando a idade do visitante
     * 
     * Saída:
     * Deverá retornar uma String com as mensagens:
     * "Acesso permitido" se o usuário tiver permissão e for maior ou igual a 18
     * anos.
     * "Acesso negado" se o usuário não tiver permissão.
     * "Idade insuficiente" se o usuário tiver permissão, mas for menor de idade.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro

        // TODO: Verifique condições de acesso
        if (hasPermission == true && age >= 18) {
            System.out.println("Acesso permitido");
        } else if (hasPermission == true && age < 18) {
            System.out.println("Idade insuficiente");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}