package org.hangman.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hangman.exception.GameIsFinishedException;

import static org.hangman.model.HangmanStatus.PENDING;

public class HangmanGame {
    private final static int HANGMAN_INITIAL_LINE_LENGHT = 9;
    private final static int HANGMAN_INITIAL_LINE_LENGHT_WITH_LINE_SEPARATOR = 10;

    private final int lineSize;
    private int hangmanInitialSize;
    private final List<HangmanChar> characters;
    private final List<HangmanChar> hangmanPaths;
    private final List<Character> failAttempts = new ArrayList<>();
    private final Set<Character> triedCharacters = new HashSet<>();

    private String hangman;
    private HangmanStatus hangmanStatus;

    public HangmanGame(final List<HangmanChar> characters) {
        var whiteSpaces = " ".repeat(characters.size());
        var characterSpace = "-".repeat(characters.size());
        this.lineSize = HANGMAN_INITIAL_LINE_LENGHT_WITH_LINE_SEPARATOR + whiteSpaces.length();
        this.hangmanStatus = PENDING;
        this.hangmanPaths = buildHangmanPathsPositions();
        buildHangmanDesgin(whiteSpaces, characterSpace);
        this.characters = setCharacterSpacesPositionsInGame(characters, whiteSpaces.length());
        this.hangmanInitialSize = this.hangman.length();
    }

    public void inputCharacter(final char character) {
        if (this.hangmanStatus != PENDING) {
            var message = this.hangmanStatus == HangmanStatus.WIN
                    ? "Parabéns! Você ganhou!"
                    : "Não foi dessa vez! Tente novamente!";
            throw new GameIsFinishedException(message);
        }

        if (triedCharacters.contains(character)) {
            System.out.println("Letra '" + character + "' já foi tentada.");
            return;
        }
        triedCharacters.add(character);

        var found = this.characters.stream()
                .filter(c -> c.getCharacter() == character)
                .toList();

        if (found.isEmpty()) {
            failAttempts.add(character);
            if (failAttempts.size() >= 6) {
                this.hangmanStatus = HangmanStatus.LOSE;
            }
            rebuildHangman(this.hangmanPaths.remove(0));
            return;
        }

        this.characters.forEach(c -> {
            if (c.getCharacter() == character) {
                c.enableVisibility();
            }
        });

        rebuildHangman();

        if (this.characters.stream().noneMatch(HangmanChar::isInvisible)) {
            this.hangmanStatus = HangmanStatus.WIN;
            System.out.println(this);
            throw new GameIsFinishedException("Parabéns! Você ganhou!");
        }
    }

    private void rebuildHangman() {
        var hangmanBuilder = new StringBuilder(this.hangman);
        for (HangmanChar c : characters) {
            if (c.isVisible()) {
                hangmanBuilder.setCharAt(c.getPosition(), c.getCharacter());
            }
        }
        var failMessage = this.failAttempts.isEmpty() ? "" : "Tentativas" + this.failAttempts;
        this.hangman = hangmanBuilder.substring(0, hangmanInitialSize) + failMessage;
    }

    private void rebuildHangman(final HangmanChar hangmanPart) {
        var hangmanBuilder = new StringBuilder(this.hangman);
        hangmanBuilder.setCharAt(hangmanPart.getPosition(), hangmanPart.getCharacter());
        var failMessage = this.failAttempts.isEmpty() ? "" : "Tentativas" + this.failAttempts;
        this.hangman = hangmanBuilder.substring(0, hangmanInitialSize) + failMessage;
    }

    @Override
    public String toString() {
        return this.hangman;
    }

    private List<HangmanChar> setCharacterSpacesPositionsInGame(final List<HangmanChar> characters, final int spacesAmount) {
        final var LINE_LETTER = 6;
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).setPosition(this.lineSize * LINE_LETTER + HANGMAN_INITIAL_LINE_LENGHT + i);
        }
        return characters;
    }

    private List<HangmanChar> buildHangmanPathsPositions() {
        final var HEAD_LINE = 3;
        final var BODY_LINE = 4;
        final var LEGS_LINE = 5;
        return new ArrayList<>(
                List.of(
                        new HangmanChar('O', this.lineSize * HEAD_LINE + 6),
                        new HangmanChar('|', this.lineSize * BODY_LINE + 6),
                        new HangmanChar('/', this.lineSize * BODY_LINE + 5),
                        new HangmanChar('\\', this.lineSize * BODY_LINE + 7),
                        new HangmanChar('/', this.lineSize * LEGS_LINE + 5),
                        new HangmanChar('\\', this.lineSize * LEGS_LINE + 7)));
    }

    private void buildHangmanDesgin(final String whiteSpaces, final String characterSpaces) {
        this.hangman = "  -----  " + whiteSpaces + System.lineSeparator() +
                " |     | " + whiteSpaces + System.lineSeparator() +
                " |     | " + whiteSpaces + System.lineSeparator() +
                " |       " + whiteSpaces + System.lineSeparator() +
                " |       " + whiteSpaces + System.lineSeparator() +
                " |       " + whiteSpaces + System.lineSeparator() +
                "=========" + characterSpaces + System.lineSeparator();
    }
}
