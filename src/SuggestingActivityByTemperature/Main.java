package SuggestingActivityByTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius: ");
        double temperature = input.nextDouble();

        if (temperature < 5) {
            System.out.println("You can ski");
        } else if (temperature >= 5 && temperature < 15) {
            System.out.println("You can go to the theater");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("You can go on a picnic");
        } else if (temperature >= 25) {
            System.out.println("You can go swimming");
        }
    }
}
