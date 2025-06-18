import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class OrganizadorHorarios {
    /**
     * Descrição
     * Você deve criar um programa que recebe uma lista de horários de reuniões
     * agendadas durante o dia,
     * cada uma representada por uma string no formato "HH:mm".
     * Seu programa deve identificar e listar os horários únicos, ordenados do mais
     * cedo ao mais tarde,
     * ignorando horários repetidos.
     *
     * Além disso, imprima quantos horários únicos foram informados.
     *
     * Entrada
     * A entrada deve seguir o seguinte formato:
     * - A primeira linha contém um número inteiro N, representando a quantidade de
     * horários.
     * - Nas próximas N linhas, cada linha contém um horário no formato "HH:mm".
     *
     * Saída
     * O programa deve imprimir:
     * - Os horários únicos ordenados, um por linha, do mais cedo para o mais tarde.
     * - Ao final, uma linha com o texto: "Total de horarios unicos: X", onde X é a
     * quantidade de horários únicos.
     *
     * Atenção:
     * - Os "horarios unicos" são os horários diferentes, ou seja, mesmo que
     * apareçam várias vezes na entrada,
     * cada horário deve aparecer apenas uma vez na saída.
     * - A saída deve estar exatamente no formato descrito, respeitando a ordem
     * crescente dos horários.
     * - A quantidade total de horários únicos deve ser exibida exatamente como
     * descrito, sem variações na formatação.
     *
     * Exemplos
     * Entrada:
     * 3
     * 15:00
     * 12:00
     * 15:00
     *
     * Saída:
     * 12:00
     * 15:00
     * Total de horarios unicos: 2
     *
     * Entrada:
     * 5
     * 08:00
     * 08:00
     * 08:00
     * 09:00
     * 10:00
     *
     * Saída:
     * 08:00
     * 09:00
     * 10:00
     * Total de horarios unicos: 3
     *
     * Observação:
     * Este desafio tem como objetivo exercitar os conceitos iniciais de lógica de
     * programação e manipulação de dados.
     * Certifique-se de validar o formato da entrada e produzir a saída exatamente
     * como especificado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de horários
        int n = Integer.parseInt(sc.nextLine());

        // Usamos TreeSet para armazenar horários únicos e ordenados automaticamente
        Set<String> horarios = new TreeSet<>();

        // TODO: leia cada horário e adicione ao conjunto
        for (int i = 0; i < n; i++) {
            String horario = sc.nextLine();
            horarios.add(horario);
        }

        // TODO: Imprima os horários únicos em ordem crescente:
        for (String h : horarios) {
            System.out.println(h);
        }

        // TODO: Imprima o total de horários únicos:
        System.out.println("Total de horarios unicos: " + horarios.size());

        sc.close();
    }
}