package DesafiosIniciais;
/*
Degusta��o de vinho �s escuras � a habilidade de identificar um vinho usando apenas seus sentidos do olfato e paladar.
Durante uma competi��o de degusta��o, uma garrafa de vinho � aberta e dividia em ta�as para que os cinco competidores possam provar. 
Eles podem cheiras, saborear e avaliar a bebida para conseguir identificar qual o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir. 
No final, as respostas s�o verificadas para determinar o n�mero de suposi��es corretas.
Dado o qual foi o tipo do vinho e as respostas fornecidas, determine o n�mero de participantes que receberam a resposta correta.
 */
import java.util.Scanner;

public class QuartoDesafio {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);

		String T = entrada.nextLine();
		String respostasCompetidores = entrada.nextLine();
		String [] respostasCompetidoresSplit = respostasCompetidores.split(" ");

		int count = 0;
		for (int i = 0 ; i < respostasCompetidoresSplit.length ; i++) {
			if (respostasCompetidoresSplit[i].equals(T)) {
				count++;
			} 
		}
		System.out.println(count);
	}
}
