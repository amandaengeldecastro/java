package DesafiosIniciais;
/*
Em 2015 um novo record foi alcan�ado na competi��o de Coxinhas de Bueno de Andrada, onde M�nica mandou pra dentro 43 coxinhas em apenas 10 minutos, passando se antecessor que conseguiu comer, no mesmo tempo, 38 coxinhas em 2014.
O restaurante especializado em coxinhas do pequeno distrito de Bueno de Andrada, interior de S�o Paulo, organiza essa competi��o todos os anos, mas nunca conseguiram entrar para o livro dos recordes, o Guinness Book. 
Para isso, o restaurante precisa preencher informa��es sobre a competi��o, como o n�mero de coxinhas consumidas pelos competidores durante o evento. 
Por�m, como j� foi informado, a especialidade deles � coxinha, n�o matem�tica, ent�o ser� que voc� pode ajud�-los? 
Com base no n�mero total de coxinhas consumidas e o n�mero de participantes na competi��o, o dono do restaurante precisa que voc� desenvolva um programa para saber a quantidade m�dia de coxinha que os participantes da competi��o conseguem devorar.
Ah, lembre que, em troca da sua ajuda, voc� poder� comer quantas coxinhas conseguir.
 */
import java.util.Scanner;

public class SegundoDesafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String input = entrada.nextLine();
		String[] inputSplit = input.split(" ");

		double media = Double.parseDouble( inputSplit[0])/Double.parseDouble(inputSplit[1]);
		System.out.printf("%.2f",   media    );
	}
}
