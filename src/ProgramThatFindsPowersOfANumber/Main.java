package ProgramThatFindsPowersOfANumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        System.out.print("Enter the value of K: ");
        int k = input.nextInt();

        for (int i = 1; i <= k; i *= n) {
            System.out.println(i);
        }
    }
}
