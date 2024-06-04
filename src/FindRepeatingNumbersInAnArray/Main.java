package FindRepeatingNumbersInAnArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + ". " + "enter element: ");
            numbers[i] = input.nextInt();
        }

        boolean[] checked = new boolean[numbers.length];

        System.out.println("Repeating numbers in the array: ");
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            if (!checked[i]) {
                for (int j = i+1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        checked[j] = true;
                    }
                }

                if (count > 1) {
                    System.out.println(numbers[i] + " is repeated " + count);
                }
            }
        }
    }
}
