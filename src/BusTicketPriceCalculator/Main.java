package BusTicketPriceCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km = 0;
        int age = 0;
        int tripType = 1;

        System.out.print("Enter the distance in km: ");
        km = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the trip type (1=> One way, 2=> Round trip): ");
        tripType = input.nextInt();

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double ticketPrice = km * 0.10;
            double ageDiscountRate = 0;

            if (age < 12) {
                ageDiscountRate = 0.50;
            } else if (age >= 12 && age <= 24) {
                ageDiscountRate = 0.10;
            } else if (age > 65) {
                ageDiscountRate = 0.30;
            }

            ticketPrice -= ticketPrice * ageDiscountRate;

            if (tripType == 2) {
                ticketPrice -= ticketPrice * 0.20;
                ticketPrice *= 2;
            }

            System.out.println("Total price : " + ticketPrice);

        } else {
            System.out.println("You entered incorrect data");
        }
    }
}
