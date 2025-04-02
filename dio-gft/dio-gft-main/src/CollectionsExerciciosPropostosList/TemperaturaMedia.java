package CollectionsExerciciosPropostosList;

/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia{
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);

		List<Double> temperatura = new ArrayList<Double>(); 

		System.out.println("Insira os valores referentes as temperaturas m�dias de janeira a junho: ");
		int count = 0;
		while (true) {
			if (count == 6) break;
			double temperaturaEntrada = entrada.nextDouble();
			temperatura.add(temperaturaEntrada);
			count++;

		}

		System.out.println("Temperaturas cadastradas:" +temperatura);

		Iterator<Double> iterator = temperatura.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}

		Double media = soma/6;
		System.out.printf("M�dia das temperaturas � de: %.2f\n ",  media);

		System.out.printf("Temperaturas acima da m�dia: ");
		temperatura.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f " , t));

		System.out.println("\nMeses das temperaturas acima da m�dia: ");

		for (Double t : temperatura) {
			if(t > media) {
				int index = temperatura.indexOf(t);
				switch (index) {
				case 0:
					System.out.println((index + 1) + " - Janeiro  ");
					break;
				case 1:
					System.out.println((index + 1) + " - Fevereiro ");
					break;
				case 2:
					System.out.println((index + 1) + " - Mar�o");
					break;
				case 3:
					System.out.println((index + 1) + " - Abril ");
					break;
				case 4:
					System.out.println((index + 1) + " - Maio ");
					break;
				case 5:
					System.out.println((index + 1) + " - Junho ");
					break;
				default:
					break;
				}  
			}
		}
	}
}


