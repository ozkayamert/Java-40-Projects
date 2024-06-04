package AverageOfElementsInArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + ". enter element");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double result = sum / numbers.length;

        System.out.println("Average of the elements in the array: " + result);
    }
}
