package DesafiosIniciais;
/*
A Copa do Mundo de Futebol � um dos maiores eventos esportivos do Planeta Terra, e o �lbum de figurinhas oficial � sempre um grande sucesso entre os amantes dessa competi��o. 
O �lbum cont�m espa�os numerados de 1 a N para colar as figurinhas; cada figurinha, tamb�m numerada de 1 a N, � uma pequena foto de um jogador de uma das sele��es que jogar� a Copa do Mundo. 
O objetivo � colar todas as figurinhas nos respectivos espa�os no �lbum, de modo a completar o �lbum, ou seja, n�o deixar nenhum espa�o sem a correspondente figurinha.
As figurinhas s�o vendidas em envelopes fechados, de forma que o comprador n�o sabe quais figurinhas est� comprando, e pode ocorrer de comprar uma figurinha que ele j� tenha colado no �lbum.
Para ajudar os usu�rios, a empresa respons�vel pela venda do �lbum e das figurinhas quer criar um aplicativo que permita gerenciar facilmente as figurinhas que faltam para completar o �lbum e est� solicitando a sua ajuda.
Dados o n�mero total de espa�os e figurinhas do �lbum, e uma lista das figurinhas j� compradas (que pode conter figurinhas repetidas), o seu desafio � determinar quantas figurinhas faltam para completar o �lbum.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TerceiroDesafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		int n = entrada.nextInt();
		int m = entrada.nextInt();
		for(int i = 0; i < m; i++) {
			int x = entrada.nextInt();
			list.add(x);
		}

		int total = list.stream().distinct().collect(Collectors.toList()).size();
		System.out.println(n - total);
	}
}
