package KDVTutariHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price, total, kdvPrice, rate = 18;

        System.out.print("Tutar giriniz: ");
        price = scan.nextDouble();

        kdvPrice = price * (rate / 100);
        total = price + kdvPrice;

        System.out.println("KDV Oranı: %" + (int)rate);
        System.out.println("KDV Tutarı: " + kdvPrice);
        System.out.println("KDV'li Tutar: " + total);
    }
}
