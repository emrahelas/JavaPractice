package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen adınızı girin :");
        String ad = scan.nextLine();
        System.out.println("Lütfen soyadınızı girin :");
        String soyad = scan.next();
        System.out.println("Lütfen yaşınızı girin :");
        int yas = scan.nextInt();
        System.out.println("Lütfen eposta adresinizi girin :");
        String mail = scan.nextLine();
        System.out.println("Lütfen şifrenizi girin :");
        String pass = scan.next();

        System.out.println("*****  KAYIT BAŞARILI  *****\n"+"\tAdınız: "+ad+"\n\tSoyadınız: "+soyad+"\n\tYaşınız: "+yas+"\n\tEposta Adresiniz: "+mail+"\n\tŞifreniz: "+pass);
    }
}
