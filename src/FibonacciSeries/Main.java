package FibonacciSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int i = 0;
        int a = 0;
        int b = 1;

        while (i < n) {
            System.out.print(a + ", ");

            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
    }
}
