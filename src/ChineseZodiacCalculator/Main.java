package ChineseZodiacCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter your year of birth: ");
        age = input.nextInt();

        int result = age % 12;

        switch (result) {
            case 0:
                System.out.println("Your Chinese zodiac sign is monkey");
                break;
            case 1:
                System.out.println("Your Chinese zodiac sign is cockerel");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign is dog");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign is pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign is mouse");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign is ox");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign is tiger");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign is rabbit");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign is dragon");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign is snake");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign is horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign is sheep");
                break;
        }
    }
}
