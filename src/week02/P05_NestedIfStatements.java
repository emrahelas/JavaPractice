package week02;

import java.util.Scanner;

public class P05_NestedIfStatements {
    public static void main(String[] args) {

        /*
        1- Kullanıcının EYT'li olup olmadığını tespit eden ve emekli olup olmayacağını yazdırın.
        Olamıyorsa kaç prim günü eksiği olduğunu yazdırın.
        KURALLAR:
        - 1999 yılı 9. ay öncesi işe başlamış olmak.
        - Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
        - Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("İşe başlama yılınızı ve ayınızı 1999,09 şeklinde girin: ");
        double giris = scan.nextDouble();
        if (giris > 1999.09) {
            System.out.println("Siz EYT Kanun düzenlemesine tabi değilsiniz.");
        } else {
            System.out.print("Lütfen cinsiyetinizi E/K olarak girin: ");
            char cins = scan.next().toUpperCase().charAt(0);
            System.out.print("Lütfen prim gün sayınızı girin: ");
            int prim = scan.nextInt();
            System.out.print("Lütfen hizmet sürenizi yıl olarak girin: ");
            int yil = scan.nextInt();

            if(cins=='E'){
                if (prim>=5500 && yil>=25){
                    System.out.println("Tebrikler EYT ile emekli olabilirsiniz!");
                } else if (prim<5500 && yil>=25) {
                    System.out.println("Kanun yürürlüğe girince "+(5500-prim)+" gün prim şartını tamamlamanız gerekmektedir.");

                } else if (prim>=5500 && yil<25){
                    System.out.println("Kanun yürürlüğe girince "+(25-yil)+" yıl daha çalışmalısınız.");
                } else {
                    System.out.println("Malesef iki şartı da sağlayamıyorsunuz, emekli olamazsınız.");
                }
            }else if(cins=='K'){
                if (prim>=5000 && yil>=25){
                    System.out.println("Tebrikler EYT ile emekli olabilirsiniz!");
                } else if (prim<5000 && yil>=20) {
                    System.out.println("Kanun yürürlüğe girince "+(5000-prim)+" gün prim şartını tamamlamanız gerekmektedir.");

                } else if (prim>=5000 && yil<20){
                    System.out.println("Kanun yürürlüğe girince "+(20-yil)+" yıl daha çalışmalısınız.");
                } else {
                    System.out.println("Malesef iki şartı da sağlayamıyorsunuz, emekli olamazsınız.");
                }
            }else {
                System.out.println("Yanlış bir değer girdiniz.");
            }
        }


        /*
        2- Kullanıcıdan aldığı ürün adedi ve liste fiyatını alın, kullanıcıya müşteri
        kartı olup olmadığını sorun. Müşteri kartı varsa 10 üründen fazla alırsa %20, yoksa %15 indirim yapin
        Müşteri kartı yoksa 10 üründen fazla alırsa %15, yoksa %10 indirim yapın
         */

        System.out.println("Lütfen kaç adet ürün aldığınızı ve liste fiyatını sırasıyla girin:");
        double urun = scan.nextInt();
        double listeFiyat = scan.nextInt();

        System.out.print("Müşteri kartınızı var mı? (E/H): ");
        char kart = scan.next().toUpperCase().charAt(0);

        if (kart=='E'){
            if (urun>10){
                System.out.println("Ödeme bedeline %20 indirim yapılmıştır. Ödemeniz gereken ücret: "+(urun*listeFiyat*0.8));
            } else if (urun<=10 && urun>=1) {
                System.out.println("Ödeme bedeline %15 indirim yapılmıştır. Ödemeniz gereken ücret: "+(urun*listeFiyat*0.85));
            } else{
                System.out.println("Yanlış ürün adedi girdiniz.");
            }
        } else if (kart=='H') {
            if (urun>10){
                System.out.println("Ödeme bedeline %15 indirim yapılmıştır. Ödemeniz gereken ücret: "+(urun*listeFiyat*0.85));
            } else if (urun<=10 && urun>=1) {
                System.out.println("Ödeme bedeline %10 indirim yapılmıştır. Ödemeniz gereken ücret: "+(urun*listeFiyat*0.9));
            } else{
                System.out.println("Yanlış ürün adedi girdiniz.");
            }

        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }


    }
}
