package ProgramToFindEvenNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
    }
}
