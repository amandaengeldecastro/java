package DesafiosIntermediarios;
/*
Na geometria Euclidiana, um pol�gono regular � um pol�gono em que todos os �ngulos s�o iguais e todos os lados tem o mesmo comprimento. 
Um pol�gono simples � aquele cujos segmentos de reta n�o se interceptam.
Voc� deve escrever um programa que, dados o n�mero e o comprimento dos lados de um pol�gono regular, mostre seu per�metro.
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

