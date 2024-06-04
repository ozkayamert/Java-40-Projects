package ProgramToFindTheSumOfOddNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number < 0) {
                break;
            }

            if (number % 2 == 1) {
                total += number;
            }
        }

        System.out.println("The sum of odd numbers is " + total);
    }
}
