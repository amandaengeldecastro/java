import java.time.LocalDate;
import java.util.Scanner;

public class MainDynamic {
    private static Bootcamp bootcamp = new Bootcamp();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean rodando = true;

        while (rodando) {
            exibirMenu();

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    criarBootcamp();
                    break;
                case "2":
                    criarCursos();
                    break;
                case "3":
                    criarMentorias();
                    break;
                case "4":
                    criarDev();
                    break;
                case "0":
                    System.out.println("Encerrando o programa.");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Escreva o número da opção que deseja ===");
        System.out.println("1. Criação do Bootcamp");
        System.out.println("2. Criação de Cursos");
        System.out.println("3. Criação de Mentorias");
        System.out.println("4. Criar Dev");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    private static void criarBootcamp() {
        System.out.print("Nome do Bootcamp: ");
        bootcamp.setNome(scanner.nextLine());

        System.out.print("Descrição do Bootcamp: ");
        bootcamp.setDescricao(scanner.nextLine());

        System.out.println("Bootcamp '" + bootcamp.getNome() + "' criado com sucesso!");
    }

    private static void criarCursos() {
        System.out.print("Quantos cursos deseja adicionar? ");
        int numCursos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCursos; i++) {
            System.out.println("\nCurso #" + (i + 1));
            Curso curso = new Curso();

            System.out.print("Título do curso: ");
            curso.setTitulo(scanner.nextLine());

            System.out.print("Descrição do curso: ");
            curso.setDescricao(scanner.nextLine());

            System.out.print("Carga horária (em horas): ");
            try {
                curso.setCargaHoraria(Integer.parseInt(scanner.nextLine()));
                bootcamp.getConteudos().add(curso);

                System.out.println("Curso '" + curso.getTitulo() + "' criado com sucesso!");
            } catch (NumberFormatException e) {
                System.out.println("Erro ao criar curso -> Carga horária inválida. Por favor, digite um número inteiro.");
                // throw new IllegalArgumentException("Carga horária inválida. Por favor, digite um número inteiro.");
            }

        }
    }

    private static void criarMentorias() {
        System.out.print("Quantas mentorias deseja adicionar? ");
        int numMentorias = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numMentorias; i++) {
            System.out.println("\nMentoria #" + (i + 1));
            Mentoria mentoria = new Mentoria();

            System.out.print("Título da mentoria: ");
            mentoria.setTitulo(scanner.nextLine());

            System.out.print("Descrição da mentoria: ");
            mentoria.setDescricao(scanner.nextLine());

            mentoria.setData(LocalDate.now());

            bootcamp.getConteudos().add(mentoria);

            System.out.println("Mentoria '" + mentoria.getTitulo() + "' criada com sucesso!");
        }
    }

    private static void criarDev() {
        if (bootcamp.getNome() == null || bootcamp.getNome().isEmpty()) {
            System.out.println("Por favor, crie um Bootcamp primeiro (opção 1).");
            return;
        }

        System.out.println("\n=== Criar Dev ===");
        Dev dev = new Dev();

        System.out.print("Nome do Dev: ");
        dev.setNome(scanner.nextLine());

        dev.inscreverBootcamp(bootcamp);
        System.out.println("Dev '" + dev.getNome() + "' inscrito no bootcamp: " + bootcamp.getNome());

        mostrarConteudosInscritos(dev);

        while (true) {
            System.out.println("\nDeseja progredir em um conteúdo? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                dev.progredir();

                mostrarConteudosInscritos(dev);
                mostrarConteudosConcluidos(dev);

                System.out.println("XP acumulado: " + dev.calcularTotalXp());
            } else {
                System.out.println("Finalizando progresso do Dev.");
                break;
            }
        }
    }

    private static void mostrarConteudosInscritos(Dev dev) {
        System.out.println("Conteúdos inscritos:");
        dev.getConteudosInscritos().forEach(c -> System.out.println("- " + c.getTitulo()));
    }

    private static void mostrarConteudosConcluidos(Dev dev) {
        System.out.println("Conteúdos concluídos:");
        dev.getConteudosConcluidos().forEach(c -> System.out.println("- " + c.getTitulo()));
    }
}
