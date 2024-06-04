package Taximeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the km data: ");
        double km = input.nextDouble();

        double price = 10 + (km * 2.20);
        price = (price < 20) ? 20 : price;

        System.out.println("The price is " + price);
    }
}
