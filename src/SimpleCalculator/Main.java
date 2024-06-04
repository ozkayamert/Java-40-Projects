package SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        System.out.println("Select a process: ");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.print("Your process: ");
        int select = input.nextInt();

        if (select == 1) {
            System.out.println("Addition : " + (a + b));
        } else if (select == 2) {
            System.out.println("Subtraction : " + (a - b));
        } else if (select == 3) {
            System.out.println("Multiplication : " + (a * b));
        } else if (select == 4) {
            if (b == 0) {
                System.out.println("The number of divisors cannot be zero");
            } else {
                System.out.println("Division : " + (a / b));
            }
        } else {
            System.out.println("Invalid selection");
        }
    }
}
