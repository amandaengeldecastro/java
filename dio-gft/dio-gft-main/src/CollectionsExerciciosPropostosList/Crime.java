package CollectionsExerciciosPropostosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
 */

public class Crime {
	public static void main (String[]args) {

		Scanner entrada = new Scanner(System.in);

		List<String> respostas = new ArrayList<>();

		System.out.println("Responda [s] para sim e [n] para não");
		System.out.println("Telefonou para a vítima?");
		String resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Esteve no local do crime?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Mora perto da vítima?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Devia para a vítima?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Já trabalhou com a vítima?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		int count = 0;
		Iterator<String> contador = respostas.iterator();
		while(contador.hasNext()){
			String respostasPositivas = contador.next();
			if(respostasPositivas.contains("s")) {
				count ++;
			}
		}
		if (count == 0 || count == 1) System.out.println("Inocente");
		if (count == 2) System.out.println("Suspeita");
		if (count == 3 || count == 4) System.out.println("Cúmplice");
		if (count == 5) System.out.println("Assassina");
	}
}