package week03;

import java.util.Scanner;

public class P06_TernaryOperator {
    public static void main(String[] args) {

        /*
        1-Kullanıcıdan bir ücgenin 3 kenar uzunluğunu alın, üçgen eşkenar ise
        "Eşkenar üçgen" yazdırın, değilse "Eşkenar değil" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını girin:");
        int ken1 = scan.nextInt();
        int ken2 = scan.nextInt();
        int ken3 = scan.nextInt();

        System.out.println(ken1 > 0 ? (ken1 == ken2 && ken2 == ken3 ? "Eşkenar üçgen" : "Eşkenar üçgen değil") : "Hatalı giriş.");

        System.out.println("");



        /*
        2- Kullanıcıdan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın,
        yoksa girilen harfi yazdırı
         */

        System.out.print("Lütfen bir harf girin: ");
        char harf = scan.next().charAt(0);
        System.out.println(((harf >= 'a' || harf <= 'z') ? Character.toUpperCase(harf) : harf));


        /*
        3- Kullanıcıdan iki adet sayı isteyin ve büyük olmayan sayıyı yazdırın
         */

        System.out.println("Lütfen iki adet sayı girin:");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println(sayi1 > sayi2 ? sayi1 : sayi2);


        /*
        4- Kullanıcıdan notunu alın 50 veya daha buyukse "sınıfı geçtin, 50'den
        küçükse "maalesef kaldın" yazdırın
         */

        System.out.print("Lütfen notunuzu girin: ");
        int not = scan.nextInt();
        System.out.println(not >= 50 ? "Sınıfı geçtin!" : "Maalesef kaldın!");

    }

}
