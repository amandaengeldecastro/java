import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DesafiosStreamAPI {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /* Desafio 1 - Mostre a lista na ordem numérica
         * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
         */
        numeros.stream().sorted().forEach(System.out::println);

        /* Desafio 2 - Imprima a soma dos números pares da lista:
         * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console 
         */
        int somaPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos numeros pares " + somaPares);

        /* Desafio 3 - Verifique se todos os números da lista são positivos:
         * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console. 
         */
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Todos os numeros positivos: " + todosPositivos);

        /* Desafio 4 - Remova todos os valores ímpares:
         * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
         */
        List<Integer> somentePares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(somentePares);

        /* Desafio 5 - Calcule a média dos números maiores que 5:
         * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
         */
         numeros.stream().filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(media -> System.out.println("Média > 5: " + media));

        /* Desafio 6 - Verificar se a lista contém algum número maior que 10:
         * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
         */
        List<Integer> maior = numeros.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println(maior);

        /* Desafio 7 - Encontrar o segundo número maior da lista:
         * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
         */
        Integer segundoMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("Segundo maior: " + segundoMaior);
        /* Desafio 8 - Somar os dígitos de todos os números da lista:
         * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
         */
        int somaDigitos = numeros.stream()
            .flatMapToInt(n -> String.valueOf(n).chars().map(Character::getNumericValue))
            .sum();
        System.out.println(somaDigitos);

        /* Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
         * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
         */
        boolean todosDistintos = numeros.size() == new HashSet<>(numeros).size();
        System.out.println("Todos distintos? " + todosDistintos);

        /* Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
         * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
         */
        List<Integer> multiplosImpares = numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .toList();
        System.out.println("Ímpares múltiplos de 3 ou 5: " + multiplosImpares);

        /* Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
         * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
         */
        int somaQuadrados = numeros.stream().mapToInt(n -> n * n).sum();
        System.out.println("Soma dos quadrados: " + somaQuadrados);

        /* Desafio 12 - Encontre o produto de todos os números da lista:
         * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
        */
        int produto = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Produto de todos: " + produto);

        /* Desafio 13 - Filtrar os números que estão dentro de um intervalo:
         * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
         */
        List<Integer> intervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).toList();
        System.out.println("Números entre 5 e 10: " + intervalo);

        /* Desafio 14 - Encontre o maior número primo da lista:
         * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
         */
        Optional<Integer> maiorPrimo = numeros.stream().filter(DesafiosStreamAPI::ehPrimo).max(Integer::compareTo);
        System.out.println("Maior primo: " + maiorPrimo.orElse(null));

        /* Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
         * Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
         */
        boolean contemNegativo = numeros.stream().anyMatch(n -> n < 0);
        System.out.println("Contém negativo? " + contemNegativo);

        /* Desafio 16 - Agrupe os números em pares e ímpares:
         * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
         */ 
        Map<Boolean, List<Integer>> paresEImpares = numeros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + paresEImpares.get(true));
        System.out.println("Ímpares: " + paresEImpares.get(false));

        /* Desafio 17 - Filtrar os números primos da lista:
         * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
         */ 
        List<Integer> primos = numeros.stream().filter(DesafiosStreamAPI::ehPrimo).toList();
        System.out.println("Numeros primos: " + primos);

        /* Desafio 18 - Verifique se todos os números da lista são iguais:
         * Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
         */ 
        boolean todosIguais = numeros.stream().distinct().count() == 1;
        System.out.println("Todos iguais? " + todosIguais);

        /* Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
         * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
         */ 
        int somaDivisiveis = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Soma divisíveis por 3 e 5: " + somaDivisiveis);
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(numero)).noneMatch(i -> numero % i == 0);
    }
 }

