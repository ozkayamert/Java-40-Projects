package PalindromeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orginalNum = num;
        int reverseNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }

        if (orginalNum == reverseNumber) {
            System.out.println(orginalNum + " It is a Palindrome Number");
        } else {
            System.out.println(orginalNum + " It is not a Palindrome Number");
        }
    }
}
