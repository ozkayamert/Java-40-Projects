package Exponentiation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number to be exponentiated: ");
        int n = input.nextInt();

        System.out.print("Number to be exponent: ");
        int k = input.nextInt();

        int result = 1;
        int i = 1;
        while (i <= k){
            result = result * n;
            i++;
        }

        System.out.println("Result: " + result);
    }
}
