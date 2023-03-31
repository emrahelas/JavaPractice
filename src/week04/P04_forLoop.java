package week04;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {

        // Girilen metni tersine çevirip kaydedin.

        Scanner scan = new Scanner(System.in);

        System.out.print("Tersine çevirmek istediğiniz kelimeyi girin: ");
        String metin = scan.next();
        String metinTers = "";
        for (int i = metin.length(); i >= 1; i--) {
            metinTers += metin.substring(i-1, i);

        }

        metin = metinTers;
        System.out.println("Girilen kelimenin tersi: " + metinTers);


    }
}
