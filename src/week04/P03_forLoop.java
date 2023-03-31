package week04;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan 150'den küçük pozitif bir sayı alın, 1'den başlayarak tüm
            tam sayıları yazdırın. Sıra;
                - 3 ile bölünebilen bir sayıya gelirse sayı yerine WISE
                - 5 ile bölünebilen bir sayıya gelirse sayı yerine QUARTER
                - Hem 3 hem 5 ile bölünebilen bir sayıya gelirse sayı yerine
                WISE QUARTER yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 150'den küçük bir sayı girin: ");
        int sayi = scan.nextInt();

        if ((sayi >= 150) || (sayi <= 0)) {
            System.err.println("Lütfen 150'den küçük pozitif bir tamsayı girin!");
        } else {
            for (int i = 1; i < sayi; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("WISE-QUARTER ");
                } else if (i % 3 == 0) {
                    System.out.print("WISE ");

                } else if (i % 5 == 0) {
                    System.out.print("QUARTER ");

                } else {
                    System.out.print(i + " ");
                }


            }


        }
    }
}
