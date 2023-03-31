package week01;

import java.sql.SQLOutput;

public class P01_printFonksiyonu {

    public static void main(String[] args) {
        // tek satir yorum

        /*
        birden fazla
        satir yorum
        yazmak icin
         */

        // Birden fazla satiri yoruma dahil etmek icin ALT tusuna basili tuturak
        // fare ile ilgili satırlar secilir ve es zamanlı // yazilir.

        System.out.println("Pratik Dersi");
        System.out.println("\"Pratik Dersi\"");

        /*

        \n  : bir alt satirdan yazmaya baslar
        \t  : bir TAB bosluk birakir
        \"  : " yazar
        \'  : ' yazar
        \\  : \ yazar
        \/  : / yazar

        */

        System.out.println("\"Hello\t\\\n'World'\t\\/\"");

        /*
        Deger atayarak
        Tarik Yigit - QA Software Test Engineer
        yazdirin
         */
        String name="Tarik";
        String surname="Yigit";
        String job="QA Software Test Engineer";
        System.out.println(name+" "+surname+" - "+job);
        System.out.println("========= KOD BASARIYLA TAMAMLANDI =========");

        System.out.println("*********  WISE BANK  *********\n\tWISE ATM'YE HOSGELDINIZ\n\t1 - Bakiye Sorgulama\n\t2 - Para yatirma\n\t3 - Para Cekme\n\t4 - Bilgi Guncelleme\n\t5 - Kart Iade\n*********  WISE BANK  *********");

    }
}
