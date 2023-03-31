package week04;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan başlangıç ve bitiş değeri olarak pozitif sayılar alın,
            sınırlar dahil olarak aralarındaki tüm sayıların toplamını yazdırın.
            Bitiş değeri başlangıç değerinden küçükse, uyarı yazdırıp işlemi
            sonlandırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen başlangıç değerini girin: ");
        int bas = scan.nextInt();
        System.out.print("Lütfen bitiş değerini girin: ");
        int bit = scan.nextInt();
        int top = 0;


        if (bit < bas) {
            System.err.println("Başlangıç değeri bitiş değerinden küçük olmalı!");
        } else {
            for (int i = bas; i <= bit; i++) {
                top += i;
            }

            System.out.println("Değerler arasındaki sayıların toplamı: " + top);

        }
    }

}

