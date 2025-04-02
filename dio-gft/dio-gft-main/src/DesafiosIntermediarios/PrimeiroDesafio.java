package DesafiosIntermediarios;
/*
Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. 
A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
 */
import java.util.Scanner;

public class PrimeiroDesafio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();

		double media = ((nota1 * 2   ) + (nota2 *  3  ) + (nota3 *  5  )) / (2+3+5);
		System.out.printf("MEDIA = %.1f", media);
	}
}
