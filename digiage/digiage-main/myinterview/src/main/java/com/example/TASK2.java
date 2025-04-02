package com.example;

import com.example.Task2.task2.ListaEncadeada;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */


public class TASK2 {
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		listaEncadeada.add("A");
		listaEncadeada.add("B");
		listaEncadeada.add("C");

		for(int i= 0; i < listaEncadeada.getTamanho(); i++) {
			System.out.print(listaEncadeada.get(i).valor);
		}
		
		listaEncadeada.delete("B");
		
		for(int i= 0; i < listaEncadeada.getTamanho(); i++) {
			System.out.print(listaEncadeada.get(i).valor);
		}
		
	}

}