package DesafiosIntermediarios;
/*
Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o mesmo comprimento. 
Um polígono simples é aquele cujos segmentos de reta não se interceptam.
Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.
 */
import java.util.Scanner;

public class TerceiroDesafio {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] split = N.split(" ");

		int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
	}
}

