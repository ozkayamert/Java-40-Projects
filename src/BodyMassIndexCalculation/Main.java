package BodyMassIndexCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = input.nextDouble();

        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();

        double index = weight / (height * height);

        System.out.println("Your body mass index: " + index);
    }
}
