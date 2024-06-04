package FindingMinAndMaxValues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers to enter: ");
        int n = input.nextInt();

        int min = 0;
        int max = 0;
        int number;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number < min || min == 0) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("The smallest number among the numbers entered: " + min);
        System.out.println("The largest number among the numbers entered: " + max);
    }
}
