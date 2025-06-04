import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetBathMachine machine = new PetBathMachine();

        String opcao;

        do {
            System.out.println("\n--- Máquina de Banho para Pets ---");
            System.out.println("1 - Colocar Pet na Máquina");
            System.out.println("2 - Retirar Pet da Máquina");
            System.out.println("3 - Dar Banho no Pet");
            System.out.println("4 - Abastecer Água");
            System.out.println("5 - Abastecer Shampoo");
            System.out.println("6 - Verificar Nível de Água");
            System.out.println("7 - Verificar Nível de Shampoo");
            System.out.println("8 - Verificar se tem Pet na Máquina");
            System.out.println("9 - Limpar Máquina");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    machine.placePet();
                    break;
                case "2":
                    machine.removePet();
                    break;
                case "3":
                    machine.giveBath();
                    break;
                case "4":
                    machine.refillWater();
                    break;
                case "5":
                    machine.refillShampoo();
                    break;
                case "6":
                    machine.checkWaterLevel();
                    break;
                case "7":
                    machine.checkShampooLevel();
                    break;
                case "8":
                    machine.isPetInMachine();
                    break;
                case "9":
                    machine.cleanMachine();
                    break;
                case "0":
                    System.out.println("Saindo da Máquina de Banho...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals("0"));

        scanner.close();
    }
}
