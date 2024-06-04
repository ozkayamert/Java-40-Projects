package FrequencyOfTheLetterInTheEnteredSentence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        System.out.print("Which letter would you like to count: ");
        char letter = scanner.nextLine().toLowerCase().charAt(0);

        int frequency = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                frequency++;
            }
        }

        System.out.println("The letter " + letter + " appears " + frequency + " times in the sentence entered");
    }
}
