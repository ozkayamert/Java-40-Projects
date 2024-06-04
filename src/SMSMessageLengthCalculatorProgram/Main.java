package SMSMessageLengthCalculatorProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Message: ");
        String message = input.nextLine();

        double smsLength = Math.ceil(message.length() / 160.0);
        System.out.println("Your message length is: " + message.length() + " and that's equal to sms: " + (int)smsLength);
    }
}
