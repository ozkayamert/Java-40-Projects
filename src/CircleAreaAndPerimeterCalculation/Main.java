package CircleAreaAndPerimeterCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = input.nextInt();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
