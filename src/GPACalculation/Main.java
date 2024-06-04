package GPACalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int physics,math,turkish,chemistry,music,history;

        System.out.print("Enter your physics grade: ");
        physics = input.nextInt();

        System.out.print("Enter your math grade: ");
        math = input.nextInt();

        System.out.print("Enter your turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Enter your chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Enter your music grade: ");
        music = input.nextInt();

        System.out.print("Enter your history grade: ");
        history = input.nextInt();

        double average = (double) (physics + math + turkish + chemistry + music + history) / 6.0;
        System.out.println("Your average: " + average);
    }
}
