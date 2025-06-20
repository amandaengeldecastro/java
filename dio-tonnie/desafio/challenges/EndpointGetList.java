import java.util.Scanner;

public class EndpointGetList {
    /*
     * Descrição
     * Simule um endpoint que recebe uma lista de nomes e retorna a lista ordenada
     * alfabeticamente, formatada como um array JSON simples.
     * 
     * Entrada
     * Uma linha com nomes separados por espaço.
     * 
     * Uma linha contendo nomes separados por espaço.
     * Saída
     * Os nomes ordenados alfabeticamente, formatados como uma lista JSON, ou seja,
     * entre colchetes [] e cada nome entre aspas duplas, separados por vírgulas e
     * espaços.
     * 
     * Exemplos
     * A tabela abaixo apresenta exemplos com alguns dados de entrada e suas
     * respectivas saídas esperadas. Certifique-se de testar seu programa com esses
     * exemplos e com outros casos possíveis.
     * 
     * Entrada Saída
     * Carlos Ana Beatriz ["Ana", "Beatriz", "Carlos"]
     * Maria Joao Pedro ["Joao", "Maria", "Pedro"]
     * Zeca Ana Ana ["Ana", "Ana", "Zeca"]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia a linha com os nomes separados por espaço:
        String linha = sc.nextLine().trim();

        // TODO: Divida os nomes em um array:
        String[] nomes = linha.split(" ");

        // TODO: Ordene os nomes alfabeticamente:
        Arrays.sort(nomes);

        // TODO: Use o StringBuilder para construir a saída no formato JSON simples:
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // TODO: Itere e adicione aspas e vírgulas entre os nome:s
        for (int i = 0; i < nomes.length; i++) {
            sb.append("\"").append(nomes[i]).append("\"");
            if (i < nomes.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        // Imprime a lista formatada
        System.out.println(sb.toString());

        sc.close();
    }
}
