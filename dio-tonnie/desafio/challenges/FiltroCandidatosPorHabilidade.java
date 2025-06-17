import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiltroCandidatosPorHabilidade {

    public static void main(String[] args) {
        /**
         * Em um processo seletivo, o RH precisa buscar rapidamente os candidatos que possuem uma determinada habilidade. 
         * Você deve criar um programa que filtre os candidatos cadastrados com base em uma palavra-chave da habilidade.
         *
         * Entrada
         * A entrada deve receber:
         * 
         * Uma primeira linha contendo dois valores separados por vírgula:
         * - Um número inteiro N representando a quantidade de candidatos cadastrados.
         * - Uma string representando a habilidade buscada.
         * 
         * As próximas N linhas conterão os dados dos candidatos no seguinte formato:
         * Nome-habilidade1,habilidade2,habilidade3...
         * 
         * A habilidade buscada e todas as habilidades dos candidatos devem ser comparadas ignorando maiúsculas e minúsculas.
         * 
         * Saída
         * Deverá retornar o nome de todos os candidatos que possuem a habilidade informada, um por linha, na ordem em que foram cadastrados.
         * Se nenhum candidato possuir a habilidade, exiba a mensagem: “Nenhum candidato encontrado”
         */

         Scanner scanner = new Scanner(System.in);

        // Ler a primeira linha: número de candidatos e habilidade buscada
        String[] primeiraLinha = scanner.nextLine().split(",");
        int n = Integer.parseInt(primeiraLinha[0].trim());
        String habilidadeBuscada = primeiraLinha[1].trim().toLowerCase();

        List<String> candidatosComHabilidade = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            // Separar nome e habilidades
            String[] partes = linha.split("-", 2);
            String nome = partes[0].trim();
            String habilidades = partes.length > 1 ? partes[1].trim() : "";

            // TODO: Divida as habilidades e verifique se alguma bate com a buscada
            String[] listaHabilidades = habilidades.split(",");
            for (String habilidade : listaHabilidades) {
                if (habilidade.trim().equalsIgnoreCase(habilidadeBuscada)) {
                    candidatosComHabilidade.add(nome);
                    break;
                }
            }
    
        }

        if (candidatosComHabilidade.isEmpty()) {
            System.out.println("Nenhum candidato encontrado");
        } else {
            for (String candidato : candidatosComHabilidade) {
                System.out.println(candidato);
            }
        }

        scanner.close();
    }
}
