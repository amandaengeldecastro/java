import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EntradaDinamica {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> dados = new LinkedHashMap<>();

        System.out.println("Informe os campos no formato: NOME_CAMPO;VALOR;TIPO");
        System.out.println("Digite 'fim' para encerrar.");

        while (true) {
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("fim")) break;

            String[] partes = linha.split(";", 3);
            if (partes.length != 3) {
                System.out.println("Entrada inválida, tente novamente.");
                continue;
            }

            String nome = partes[0].trim();
            String valorStr = partes[1].trim();
            String tipo = partes[2].trim().toLowerCase();

            Object valor = parseValor(valorStr, tipo);
            dados.put(nome, valor);
        }

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();
        YAMLMapper yamlMapper = new YAMLMapper();

        System.out.println("\nJSON:");
        System.out.println(jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dados));

        System.out.println("\nXML:");
        System.out.println(xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dados));

        System.out.println("\nYAML:");
        System.out.println(yamlMapper.writeValueAsString(dados));

        scanner.close();
    }

    private static Object parseValor(String valorStr, String tipo) {
        try {
            switch (tipo) {
                case "texto":
                    return valorStr;
                case "inteiro":
                    return Integer.parseInt(valorStr);
                case "float":
                    return Float.parseInt(valorStr);
                case "ponto flutuante":
                    return Double.parseDouble(valorStr);
                case "booleano":
                    return Boolean.parseBoolean(valorStr);
                case "data":
                    return LocalDate.parse(valorStr, DateTimeFormatter.ISO_LOCAL_DATE);
                case "data e hora":
                    return LocalDateTime.parse(valorStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                default:
                    return valorStr;
            }
        } catch (Exception e) {
            return valorStr;
        }
    }
}
