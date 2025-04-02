package CollectionsExerciciosPropostosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
1. "Telefonou para a v�tima?"
2. "Esteve no local do crime?"
3. "Mora perto da v�tima?"
4. "Devia para a v�tima?"
5. "J� trabalhou com a v�tima?"
Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como
"C�mplice" e 5 como "Assassina". Caso contr�rio, ele ser� classificado como "Inocente".
 */

public class Crime {
	public static void main (String[]args) {

		Scanner entrada = new Scanner(System.in);

		List<String> respostas = new ArrayList<>();

		System.out.println("Responda [s] para sim e [n] para n�o");
		System.out.println("Telefonou para a v�tima?");
		String resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Esteve no local do crime?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Mora perto da v�tima?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("Devia para a v�tima?");
		resposta = entrada.nextLine();
		respostas.add(resposta);

		System.out.println("J� trabalhou com a v�tima?");
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
		if (count == 3 || count == 4) System.out.println("C�mplice");
		if (count == 5) System.out.println("Assassina");
	}
}