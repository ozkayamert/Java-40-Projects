package HarmonicSeriesCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        double result = 0;

        for (double i = 1; i <= n; i++) {
            result = result + (1 / i);
        }

        System.out.println("The result is: " + result);
    }
}
