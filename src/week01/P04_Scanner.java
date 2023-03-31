package week01;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi girin: ");
        String name=scan.next();
        System.out.println("Lutfen soyadinizi girin: ");
        String surname=scan.next();
        System.out.println("Lutfen yasinizi girin: ");
        int age=scan.nextInt();
        System.out.println("E-Posta adresinizi girin: ");
        String mail=scan.next();
        System.out.println("Lutfen sifrenizi girin: ");
        String pass=scan.next();

        System.out.println("********  KAYIT BASARILI  ********\n"+"\tAdiniz \t\t:"+name+"\n\tSoyadiniz \t:"+surname+"\n\tYasiniz \t:"+age+"\n\tE-Posta \t:"+mail+"\n\tSifreniz \t:"+pass+"\n\t seklinde kaydiniz basariyla tamamlanmistir." );
    }
}
