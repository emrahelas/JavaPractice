package week03;


import java.util.Scanner;

public class P07_SwitchStatements {
    public static void main(String[] args) {

        /*
        1- Kullanıcıdan bir rakam alıp, rakamı yazıyla yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir rakam girin: ");
        int rakam = scan.nextInt();

        switch (rakam) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            case 0:
                System.out.println("Sıfır");
                break;

            default:
                System.out.println("Rakam 0-9 arasında olmalıdır.");

        }



        /*
        3- Kullanıcıdan ay numarasını alıp mevisim yazdırın.
         */

        System.out.print("Lütfen ilgili ayın numarasını girin: ");

        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 12, 1, 2:
                System.out.println("Kış");
                break;
            case 3, 4, 5:
                System.out.println("İlkbahar");
                break;
            case 6, 7, 8:
                System.out.println("Yaz");
                break;
            case 9, 10, 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Yanlış numara girdiniz!");
        }


        /*
        4-Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
         */

        System.out.println("Yıl ve ay numarasını sırasıyla girin:");
        int yil = scan.nextInt();
        int ay = scan.nextInt();
        int gun = 0;
        switch (ay) {
            case 1, 3, 5, 7, 8, 10, 12:
                gun = 31;
                break;
            case 4, 6, 9, 11:
                gun = 30;
                break;
            case 2:
                gun = ((yil % 4 == 0 && !(yil % 100 == 0) || yil % 400 == 0) ? 29 : 28);
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz!");
        }
        System.out.println("Girdiğiniz yıldaki ayın gün sayısı: "+gun);


    }
}
