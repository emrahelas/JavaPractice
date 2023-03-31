package week04;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan pozitif bir tamsayı alın, 1'den girilen sayıya kadar
            (girilen sayı dahil) 7 ile bölünebilen sayıları yazdırın.
         */

        Scanner scan = new Scanner (System.in);
        System.out.print("Lütfen pozitif bir tamsayı girin: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");

            }

        }
        System.out.println("");
        System.err.println("BURAYA KADAR!!!"); // serr kullanımı


    }
}
