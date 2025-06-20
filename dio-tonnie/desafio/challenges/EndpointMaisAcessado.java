import java.util.Scanner;

public class EndpointMaisAcessado {

    /*
     * Descrição
     * Receba uma lista de strings representando endpoints acessados e retorne o
     * endpoint mais acessado. Se houver empate, retorne o que apareceu primeiro na
     * lista.
     * 
     * Entrada
     * Uma linha com nomes de endpoints separados por espaço.
     * 
     * Uma linha contendo os nomes dos endpoints separados por espaço.
     * Saída
     * O nome do endpoint mais acessado.
     * 
     * Exemplos
     * A tabela abaixo apresenta exemplos com alguns dados de entrada e suas
     * respectivas saídas esperadas. Certifique-se de testar seu programa com esses
     * exemplos e com outros casos possíveis.
     * 
     * Entrada Saída
     * /login /home /login /profile /login
     * /api /api /home /api /api
     * /dashboard /settings /dashboard /dashboard
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a linha com os endpoints separados por espaço
        String linha = sc.nextLine().trim();

        // Divide a linha em um array de endpoints
        String[] endpoints = linha.split(" ");

        // Cria um mapa para contar a frequência dos endpoints (preservando a ordem de inserção)
        Map<String, Integer> frequencia = new LinkedHashMap<>();

        // Contabiliza a frequência dos endpoints
        for (String endpoint : endpoints) {
            frequencia.put(endpoint, frequencia.getOrDefault(endpoint, 0) + 1);
        }

        // Variáveis para armazenar o endpoint mais acessado
        String maisAcessado = "";
        int maxFrequencia = 0;

        // Encontra o endpoint com maior frequência
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maisAcessado = entry.getKey();
                maxFrequencia = entry.getValue();
            }
        }

        // Imprime o endpoint mais acessado
        System.out.println(maisAcessado);

        sc.close();
    }
}