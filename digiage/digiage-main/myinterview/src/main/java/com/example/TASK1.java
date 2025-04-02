package com.example;

import java.util.Scanner;

/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {
	
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        System.out.println("Digite uma palavra");
    	
    	String word = input.nextLine();
    	
        String invertedWord = "";

        invertedWord = new StringBuffer(word).reverse().toString();
        if(word.equals(invertedWord)) {
            System.out.println("A palavra é palindrome");
        }else {
            System.out.println("A palavra não é palindrome");
        }
    }
 
}