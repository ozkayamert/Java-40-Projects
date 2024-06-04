package GroceryBasketAmountCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cucumber = 3.14;
        double apple = 4.11;
        double orange = 2.22;
        double tomato = 0.95;
        double mango = 7.00;

        System.out.print("How many kilograms of cucumber: ");
        double cucumberKilogram = input.nextDouble();

        System.out.print("How many kilograms of apple: ");
        double appleKilogram = input.nextDouble();

        System.out.print("How many kilograms of orange: ");
        double orangeKilogram = input.nextDouble();

        System.out.print("How many kilograms of tomato: ");
        double tomatoKilogram = input.nextDouble();

        System.out.print("How many kilograms of mango: ");
        double mangoKilogram = input.nextDouble();

        double total = (cucumber * cucumberKilogram) + (apple * appleKilogram) + (orange * orangeKilogram) + (tomato * tomatoKilogram) + (mango * mangoKilogram);
        System.out.println("Total price: " + total);
    }
}
