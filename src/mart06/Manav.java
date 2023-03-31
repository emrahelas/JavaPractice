package mart06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav {

        /*
            Basit bir 5 ürünlü alışveriş programı yazınız.

                1. adım: Ürün listesinden ürün seçtir ve kaç kilo olduğunu sor.
                2. adım: Başka bir ürün almak isteyip istemediğini sor,
                         istemiyorsa toplam miktarı göster, istiyorsa tekrar ürün seçtir.
                         Bu işlemi alışverişi bitirmek isteyene kadar tekrarla.
                3. adım: Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
                4. adım: Alışveriş bitince toplam ödemesi gereken tutarı göster.
         */

    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("1. Domates", "2. Soğan", "3. Portakal", "4. Elma", "5. Kivi"));
    static ArrayList<Integer> fiyatListesi = new ArrayList<>(Arrays.asList(15, 18, 13, 10, 17));
    static int tutar;

    public static void main(String[] args) {
        System.out.println("*** Yıldız Manav ***");
        System.out.println("");
        urunsec();

    }


    private static void urunsec() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün seçin");

        for (String each : urunListesi) {
            System.out.println(each);


        }

        System.out.println("");
        System.out.print("Seçiminiz: ");
        int secim = scan.nextInt();

        System.out.print("Kaç KG ürün alacaksınız? ");
        int miktar = scan.nextInt();

        tutar += miktar * fiyatListesi.get(secim-1);
        System.out.print("Alışverişe devam etmek istiyor musunuz? (E/H) ");
        char cikis = scan.next().toUpperCase().charAt(0);
        if (cikis == 'H'){
            System.out.println("Ödenecek tutar: "+tutar+" TL");
            System.exit(0);
        }else {
            urunsec();
        }
    }

}
