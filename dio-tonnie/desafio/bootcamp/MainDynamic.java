import java.time.LocalDate;
import java.util.Scanner;

public class MainDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bootcamp bootcamp = new Bootcamp();

        System.out.println("=== Criação do Bootcamp ===");
        System.out.print("Nome do Bootcamp: ");
        bootcamp.setNome(scanner.nextLine());

        System.out.print("Descrição do Bootcamp: ");
        bootcamp.setDescricao(scanner.nextLine());

        System.out.print("Quantos cursos deseja adicionar? ");
        int numCursos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCursos; i++) {
            System.out.println("Curso #" + (i+1));
            Curso curso = new Curso();

            System.out.print("Título do curso: ");
            curso.setTitulo(scanner.nextLine());

            System.out.print("Descrição do curso: ");
            curso.setDescricao(scanner.nextLine());

            System.out.print("Carga horária (em horas): ");
            curso.setCargaHoraria(Integer.parseInt(scanner.nextLine()));

            bootcamp.getConteudos().add(curso);
        }

        System.out.print("Quantas mentorias deseja adicionar? ");
        int numMentorias = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numMentorias; i++) {
            System.out.println("Mentoria #" + (i+1));
            Mentoria mentoria = new Mentoria();

            System.out.print("Título da mentoria: ");
            mentoria.setTitulo(scanner.nextLine());

            System.out.print("Descrição da mentoria: ");
            mentoria.setDescricao(scanner.nextLine());

            mentoria.setData(LocalDate.now()); 

            bootcamp.getConteudos().add(mentoria);
        }

        System.out.println("\n=== Criar Dev ===");
        Dev dev = new Dev();
        System.out.print("Nome do Dev: ");
        dev.setNome(scanner.nextLine());

        dev.inscreverBootcamp(bootcamp);
        System.out.println("Dev " + dev.getNome() + " inscrito no bootcamp: " + bootcamp.getNome());

        System.out.println("Conteúdos inscritos:");
        dev.getConteudosInscritos().forEach(c -> System.out.println("- " + c.getTitulo()));

        while(true) {
            System.out.println("\nDeseja progredir em um conteúdo? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("s")) {
                dev.progredir();
                System.out.println("Conteúdos inscritos restantes:");
                dev.getConteudosInscritos().forEach(c -> System.out.println("- " + c.getTitulo()));

                System.out.println("Conteúdos concluídos:");
                dev.getConteudosConcluidos().forEach(c -> System.out.println("- " + c.getTitulo()));

                System.out.println("XP acumulado: " + dev.calcularTotalXp());
            } else {
                System.out.println("Encerrando o programa.");
                break;
            }
        }

        scanner.close();
    }
}
