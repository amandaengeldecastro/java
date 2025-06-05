import java.util.Scanner;

@FunctionalInterface
interface ServicoMensagem {
    void enviar(String mensagem);
}

public class EnviarMensagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ServicoMensagem sms = mensagem -> System.out.println("Enviando SMS: " + mensagem);
        ServicoMensagem email = mensagem -> System.out.println("Enviando Email: " + mensagem);
        ServicoMensagem redesSociais = mensagem -> System.out.println("Postando nas Redes Sociais: " + mensagem);
        ServicoMensagem whatsapp = mensagem -> System.out.println("Enviando WhatsApp: " + mensagem);

        System.out.println("Digite a mensagem que deseja enviar:");
        String mensagem = sc.nextLine();

        System.out.println("Escolha o serviço: 1-SMS, 2-Email, 3-Redes Sociais, 4-WhatsApp");
        int opcao = sc.nextInt();

        ServicoMensagem servicoSelecionado = switch (opcao) {
            case 1 -> sms;
            case 2 -> email;
            case 3 -> redesSociais;
            case 4 -> whatsapp;
            default -> msg -> System.out.println("Serviço inválido!");
        };

        servicoSelecionado.enviar(mensagem);

        sc.close();
    }
}
