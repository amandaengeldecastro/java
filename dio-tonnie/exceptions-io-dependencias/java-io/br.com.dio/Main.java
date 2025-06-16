import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner scanner = new Scanner(System.in);

        FilePersistence filePersistence = new IOFilePersistence("user.csv");
        // System.out.println("Digite o nome:");
        // String nome = scanner.nextLine();

        // System.out.println("Digite o e-mail:");
        // String email = scanner.nextLine();

        // System.out.println("Digite a data de nascimento (dd/MM/yyyy):");
        // String dataNascimento = scanner.nextLine();

        // String dados = nome + ";" + email + ";" + dataNascimento;
        // filePersistence.write(dados);

        // System.out.println("Usuário salvo com sucesso!");
        filePersistence.write("Amanda;amandaengeldecastro@gmail.com;XX/XX/1993");
        filePersistence.write("Scheila;scheila@gmail.com;XX/XX/XX89");
        // System.out.println(filePersistence.findAll());
        // System.out.println(filePersistence.findBy("Amanda;"));
        // System.out.println(filePersistence.remove("XX/XX/1993"));

        String resultado = filePersistence.replace(
                "Amanda;amandaengeldecastro@gmail.com;XX/XX/1993",
                "Amanda;amanda.castro@gmail.com;08/11/1993"
        );

        System.out.println("Resultado do replace: " + (resultado != null ? "Sucesso" : "Nada foi alterado"));
        System.out.println("Conteúdo atualizado:");
        System.out.println(filePersistence.findAll());

    }
}
