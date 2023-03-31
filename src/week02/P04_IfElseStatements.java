package week02;

import java.util.Scanner;

public class P04_IfElseStatements {
    public static void main(String[] args) {

        /*
        1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 ------> AA
        80-85  ------> BA
        75-80  ------> BB
        65-75  ------> CB
        50-65  ------> CC
        50 altı ise -----> FF
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen notunuzu girin: ");
        int not = scan.nextInt();

        if (not >= 85 && not <= 100) {
            System.out.println("AA");
        } else if (not >= 80 && not < 85) {
            System.out.println("BA");
        } else if (not >= 75 && not < 80) {
            System.out.println("BB");
        } else if (not >= 65 && not < 75) {
            System.out.println("CB");
        } else if (not >= 50 && not < 65) {
            System.out.println("CC");
        } else if (not >= 0 && not < 50) {
            System.out.println("FF");
        } else {
            System.out.println("Yanlış giriş");
        }

        /*
        Not: Birden fazla if,elseif, else durumlarında en son adıma bakılır
        else ile bitiyorsa tüm ihtimaller kapsanır.
        else if ile bitiyorsa kapsanmayan ihtimaller vardır.
         */


        /*
        2- Kullanıcıdan mesafeyi kilometre olarak alın ve çevmek istediği birimi
        sorun, istediği birim metre veya santimetre ise çevirip yazdırın, yoksa
        istediğiniz birim sisteme kayitli değil yazdırın.
         */

        System.out.print("Çevirmek istediğiniz mesafe değerini KM cinsinden girin: ");
        int km = scan.nextInt();
        System.out.print("Dönüştürmek istediğiniz birimi girin(metre ya da sanimetre): ");
        char birim = scan.next().charAt(0);
        if (birim == 'M' || birim == 'm') {
            System.out.println("Girdiğiniz mesafenin metre değeri: " + km * 1000);
        } else if (birim == 'S' || birim == 's') {
            System.out.println("Girdiğiniz mesafenin santimetre değeri: " + km * 100000);
        } else {
            System.out.println("Girdiğiniz birim sisteme kayıtlı değil.");
        }


        /*
        Soru - Interview Question
        Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artil yil degildir.
        Kural 2: 4 ile bolunup 100 ile bolunemeyen yıllar artik yildir
        Kural 3: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
         */

        System.out.print("Yıl değerini girin: ");
        int yil = scan.nextInt();
        if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println("Artık yıl.");
        } else if (yil % 4 != 0) {
            System.out.println("Artık yıl değil.");
        } else if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Artık yıl.");
        }


        /*
        3-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri, Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
        olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
         */

        System.out.print("Lütfen yaşınızı ve cinsiyetinizi girin: ");
        int yas = scan.nextInt();

        char cins = scan.next().charAt(0);

        if ((cins == 'e' || cins == 'E') && yas >= 65) {
            System.out.println("Emekli olabilirsiniz.");
        } else if ((cins == 'e' || cins == 'E') && ((yas < 65) || (yas > 17))) {
            System.out.println("Emekli olabilmek için "+(65-yas)+" yıl daha çalışmanız gerekir.");

        }else if ((cins == 'k' || cins == 'K') && yas >= 60){
            System.out.println("Emekli olabilirsiniz.");
        } else if ((cins == 'k' || cins == 'K') && ((yas < 60) || (yas > 17))) {
            System.out.println("Emekli olabilmek için "+(60-yas)+" yıl daha çalışmanız gerekir.");

        }else{
            System.out.println("Hatalı cinsiyet girdiniz!");
        }


    }
}
