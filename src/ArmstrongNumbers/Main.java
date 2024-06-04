package ArmstrongNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        int a = number;

        int b = number;

        int digit;

        int total = 0;

        int count = 0;

        while(a > 0)  {

            digit = a % 10;
            count++;
            a = a / 10;
        }

        while(number > 0)  {

            digit = number % 10;
            number = number / 10;

            total = total + (int)Math.pow(digit,count);
        }

        if(total == b)   {
            System.out.println(" This number is an armstrong number ");
        }else  {
            System.out.println(" This number is not an armstrong number !!! ");
        }
    }
}
