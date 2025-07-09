package org.hangman;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.hangman.model.HangmanChar;
import org.hangman.model.HangmanGame;
import org.hangman.exception.GameIsFinishedException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a palavra a ser adivinhada: ");
            String palavra = scanner.nextLine().trim().toLowerCase();

          

            List<HangmanChar> characters = palavra.chars()
                    .mapToObj(c -> new HangmanChar((char) c))
                    .collect(Collectors.toList());

            HangmanGame game = new HangmanGame(characters);

            System.out.println("Jogo iniciado! Tente adivinhar a palavra.");
            System.out.println(game);

            boolean jogoAtivo = true;
            while (jogoAtivo) {
                System.out.print("Digite uma letra: ");
                String line = scanner.nextLine().trim().toLowerCase();

                if (line.isEmpty()) {
                    System.out.println("Entrada vazia. Digite uma letra.");
                    continue;
                }

                char input = line.charAt(0);

                try {
                    game.inputCharacter(input);
                    System.out.println(game);
                } catch (GameIsFinishedException e) {
                    System.out.println(e.getMessage());
                    jogoAtivo = false;
                } catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                    jogoAtivo = false;
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("s")) {
                System.out.println("Obrigado por jogar!");
                break;
            }

        }

        scanner.close();
    }
}
