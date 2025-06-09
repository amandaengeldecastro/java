import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ClassificacaoCandidatos {

    static class Candidato {
        String nome;
        int pontuacao;

        Candidato(String nome, int pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Um recrutador atribui uma pontuação técnica para cada candidato em um processo seletivo. 
         * Você deve criar um programa que classifica os candidatos da maior para a menor pontuação 
         * e exibe seus nomes nessa ordem.
         *
         * Entrada
         * A entrada deve receber:
         * - Um número inteiro N representando o número de candidatos.
         * - Para cada candidato: o nome e a pontuação técnica (inteiro de 0 a 100), separados por vírgula.
         *
         * Saída
         * Deverá retornar os nomes dos candidatos, ordenados da maior para a menor pontuação, um por linha. 
         * Se dois candidatos tiverem a mesma pontuação, o nome deve aparecer em ordem alfabética.
         *
         * Exemplo:
         * Entrada
         * 3
         * Ana,85
         * Bruno,90
         * Clara,75
         * 
         * Saída
         * Bruno
         * Ana
         * Clara
         */

        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Candidato> candidatos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            // Exemplo de entrada: "Ana,85"
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int pontuacao = Integer.parseInt(partes[1].trim());

            candidatos.add(new Candidato(nome, pontuacao));
        }

        // TODO: Ordene: maior pontuação primeiro; se empate, ordem alfabética do nome
        Collections.sort(candidatos, new Comparator<Candidato>() {
            @Override
            public int compare(Candidato c1, Candidato c2) {
                if (c2.pontuacao != c1.pontuacao) {
                    return Integer.compare(c2.pontuacao, c1.pontuacao); 
                }
                return c1.nome.compareToIgnoreCase(c2.nome); // Ordem alfabética em caso de empate
            }
        });

        // Imprimir nomes na ordem definida
        for (Candidato c : candidatos) {
            System.out.println(c.nome);
        }

        scanner.close();
    }
}
