package DesafiosIntermediarios;

/*
Você recebeu o desafio de ler 100 valores inteiros. 
Apresente então o maior valor lido e a posição dentre os 100 valores lido
 */

import java.util.Scanner;

public class QuartoDesafio {
	public static void main(String[] args) {
	    
		   Scanner entrada = new Scanner(System.in);
				int maior = 0;
				int posicaoMaior = 1;
				int x;
				
				for (int i = 1; i <= 100; i++) {
					x = entrada.nextInt();
					if (i == 1) {
						maior = x;
						posicaoMaior = 1;
					} else if (x > maior) {
						maior = x;
						posicaoMaior = i;
					}
				}
				
				System.out.println(maior);
				System.out.println(posicaoMaior);
			
		  }
}
