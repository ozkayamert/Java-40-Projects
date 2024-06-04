package FindingTheDigitsOfANumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digitCount = 0;

        do {
            num = num / 10;
            digitCount++;
        } while (num != 0);

        System.out.println("Number of digits: " + digitCount);
    }
}
