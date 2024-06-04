package EBOKAndEKOKFindingProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int number2 = input.nextInt();

        int n = Math.min(number1, number2);
        int ebob = 1;

        for (int i = 1; i <= n; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                ebob = i;
            }
        }

        int ekok = (number1 * number2) / ebob;

        System.out.println("EBOB is " + ebob);
        System.out.println("EKOK is " + ekok);
    }
}
