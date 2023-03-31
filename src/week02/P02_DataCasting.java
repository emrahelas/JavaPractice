package week02;

import java.util.Scanner;

public class P02_DataCasting {

    public static void main(String[] args) {
        /*
        1- Int olarak verilen 3 sayının toplamını double olarak yazdırın
        ipucu: double>float>long>int>short>byte
         */

        int a = 3, b = 9, c = 7;

        double toplam = (a + b + c);
        System.out.println("toplam = " + (int) toplam);



        /*
        2- Kullanıcıdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki 3 harf :
           şeklinde yazdırın.
           ipucu: char
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir harf girin: ");
        char harf = scan.next().charAt(0);
        System.out.println("\tGirdiğiniz harf : " + harf + "\n\tGirdiğiniz harften sonraki 3 harf: " + (char) (harf + 1) + ", " + (char) (harf + 2) + ", " + (char) (harf + 3));


        /*
        3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı olarak yazdırın
        ipucu: sorumluluk bende
         */

        System.out.print("Lütfen iki adet ondalıklı sayı girin: ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.print("Sonuç : " + (int)(sayi1/sayi2));
    }
}
