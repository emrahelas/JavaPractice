package week03;

import java.util.Scanner;

public class P08_StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "Java Coffee";
        System.out.println(str.toUpperCase()); // JAVA COFFEE
        System.out.println(str.toLowerCase()); // java coffee

        String str1 = "Java Tayfa";
        String str2 = "Java Tayfa";
        str1=str1.toLowerCase();
        System.out.println(str1.equals(str2));
        System.out.println((str1 == str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.length());

        System.out.println(str1.concat(" Kahve"));

        String str3 = str.concat(" "+str2);

        System.out.println(str3.length());

        System.out.println(str.substring(5,9));



        /*
        1- Kullanicidan isim ve soyismini ayrı ayrı alın.
        ismi daha uzun ise, isim ve soyismi ilk harf büyük kalanlar kücük şeklinde
        yazdırın. Soyisim daha uzun ise ismi ilk harf büyük diğerleri küçük,
        soyismi büyük harflerle yazdırın.
         */


        System.out.print("Lütfen adınızı girin: ");
        String isim = scan.nextLine();
        System.out.print("Lütfen soyadınızı girin: ");
        String soyisim = scan.next();

        if (isim.length() > soyisim.length()) {
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1, isim.length()).toLowerCase();
            soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1, soyisim.length()).toLowerCase();

        } else {
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1, isim.length()).toLowerCase();
            soyisim = soyisim.toUpperCase();

        }
        System.out.println(isim+" "+soyisim);
    }
}
