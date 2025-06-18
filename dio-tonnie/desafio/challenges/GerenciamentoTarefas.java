import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoTarefas {
    /**
     * Descrição
     * Você deve criar um programa que receba uma lista de tarefas a serem feitas
     * durante o dia.
     * Cada tarefa possui um nome e uma prioridade (número inteiro).
     * Ordene as tarefas pela prioridade crescente e imprima a lista organizada.
     *
     * Entrada
     * - A primeira linha contém um número inteiro N, representando a quantidade de
     * tarefas.
     * - Em seguida, haverá N linhas, cada uma no formato: "nome da
     * tarefa,prioridade".
     *
     * Saída
     * - O programa deve imprimir a lista de tarefas ordenadas por prioridade em
     * ordem crescente.
     * - Cada linha deve estar no formato: tarefa - prioridade.
     *
     * Exemplo 1
     * Entrada:
     * 3
     * Estudar Java, 1
     * Reuniao Tech, 3
     * Pausa Cafe, 2
     *
     * Saída:
     * Estudar Java - 1
     * Pausa Cafe - 2
     * Reuniao Tech - 3
     *
     * Exemplo 2
     * Entrada:
     * 4
     * Enviar Emails, 2
     * Almoco, 3
     * Validar Codigos,1
     * Exercicios, 4
     *
     * Saída:
     * Validar Codigos - 1
     * Enviar Emails - 2
     * Almoco - 3
     * Exercicios - 4
     *
     * Observações
     * - É extremamente importante que as entradas e saídas sejam exatamente iguais
     * à descritas.
     * - Os desafios aqui têm como objetivo praticar lógica de programação.
     * - Se você está iniciando, utilize o template fornecido e complete conforme os
     * conceitos aprendidos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número de tarefas
        int n = Integer.parseInt(sc.nextLine());

        // TODO: Crie uma lista para armazenar as tarefas como pares (nome, prioridade):
        List<Tarefa> tarefas = new ArrayList<>();

        // TODO: Leia cada linha, separada por nome e prioridade e adiciona à lista:
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int prioridade = Integer.parseInt(partes[1].trim());
            tarefas.add(new Tarefa(nome, prioridade));
        }

        // TODO: Ordene a lista pela prioridade crescente:
        tarefas.sort(Comparator.comparingInt(t -> t.prioridade));

        // Imprime a lista ordenada no formato "tarefa - prioridade":
        for (Tarefa t : tarefas) {
            System.out.println(t.nome + " - " + t.prioridade);
        }

        sc.close();
    }

    // Classe auxiliar para armazenar nome e prioridade:
    static class Tarefa {
        String nome;
        int prioridade;

        public Tarefa(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
    }
}
