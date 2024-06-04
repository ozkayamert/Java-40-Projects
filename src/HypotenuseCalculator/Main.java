package HypotenuseCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second edge: ");
        int b = scanner.nextInt();

        double c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hypotenuse: " + (int)c);
    }
}
