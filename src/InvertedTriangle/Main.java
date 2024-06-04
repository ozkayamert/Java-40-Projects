package InvertedTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        int a = number;

        for(int i = 1;i <= number;i++)  {

            for(int k = 1;k <= i - 1;k++)  {
                System.out.print(" ");
            }

            for(int f = 1;f <= 2 * a - 1;f++) {
                System.out.print('*');
            }

            a--;

            System.out.println();
        }
    }
}
