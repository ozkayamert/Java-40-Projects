package Hangman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"Java", "programming", "computer", "human", "book"};
        String wordToGuess = words[random.nextInt(words.length)];
        //String wordToGuess = words[0];
        //System.out.println(wordToGuess);

        boolean[] guessedLetters = new boolean[wordToGuess.length()];
        int remainingGuess = 6;

        System.out.println("Welcome to Hangman");
        System.out.println("Enter a letter to guess the word");

        while (remainingGuess > 0) {
            System.out.println();

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guessedLetters[i]) {
                    System.out.print(wordToGuess.charAt(i) + " ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.println("");
            System.out.println("Your remaining guess: " + remainingGuess);
            System.out.print("Enter a letter: ");
            char guess = input.next().charAt(0);

            boolean isFound = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedLetters[i] = true;
                    isFound = true;
                }
            }

            if (isFound) {
                System.out.println("Letter guessed correctly");
            } else {
                remainingGuess--;
                System.out.println("No letter found. False guess");
            }

            boolean isComplete = true;
            for (boolean letter : guessedLetters) {
                if (!letter) {
                    isComplete = false;
                    break;
                }
            }

            if (isComplete) {
                System.out.println("Congratulations you got the word right"+ wordToGuess);
                break;
            }
        }

        if (remainingGuess == 0) {
            System.out.println("You're out of guesses");
            System.out.println("The right word: " + wordToGuess);
        }
    }
}
