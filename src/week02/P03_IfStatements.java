package week02;

import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {

        /*
        1- Kullanıcıdan gün ismini alın ve haftaiçi veya hafta sonu olduğunu yazdırın
        Örnek: gun+Pazar output = "Hafta sonu" gun+Sali output + "Hafta ici"
        *** String icin equals methodunu kullanın
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Gün ismini girin: ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Haftasonu");

        }
        if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Haftaiçi");
        }
        if (!(gun.equals("cumartesi") || gun.equals("pazar") || gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma"))) {
            System.out.println("Hatalı gün ismi girdiniz!");
        }

        /*
        2- Kullanıcıdan iki adet vize notu ve bir adet final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 finaller %60 olacak şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        küçükse Malesef Kaldınız olarak aşağıdaki formatta yazdırınız

        Ad:
        Soyad:
        1. Vize:
        2. Vize:
        Final:
        Yıl Sonu Notu:
        Ders Durumu:
         */

        System.out.print("Lütfen adınızı girin: ");
        String ad = scan.next();
        System.out.print("Lütfen soyadınızı girin: ");
        String soyad = scan.next();
        System.out.print("1. Vize notunuzu girin: ");
        int vize1 = scan.nextInt();
        System.out.print("2. Vize notunuzu girin: ");
        int vize2 = scan.nextInt();
        System.out.print("Final notunuzu girin: ");
        int finalNot = scan.nextInt();
        int yilSonu = (((vize1+vize2)/2)*40/100)+(finalNot*60/100);

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("1. Vize: "+vize1);
        System.out.println("2. Vize: "+vize2);
        System.out.println("Final: "+finalNot);
        System.out.println("Yıl Sonu Not: "+yilSonu);

        if (yilSonu>=50){
            System.out.println("Ders Durumu: GEÇTİNİZ");
        }if (yilSonu<50){
            System.out.println("Ders Durumu: KALDINIZ");
        }



    }
}
