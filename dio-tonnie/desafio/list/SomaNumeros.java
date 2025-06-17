import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }

    public void calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros)
            soma += numero;
        System.out.println("A soma de todos os números são:" + soma);
    }

    public void encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        for (Integer numero : numeros) {
            if (numero >= maiorNumero) {
                maiorNumero = numero;

            }
        }
        System.out.println("O maior número é: " + maiorNumero);

    }

    public void encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Integer numero : numeros) {
            if (numero <= menorNumero) {
                menorNumero = numero;

            }
        }
        System.out.println("O menor número é: " + menorNumero);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);

        somaNumeros.exibirNumeros();
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();

    }
}
