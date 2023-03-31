package week01;

public class P02_dataTypes {
    public static void main(String[] args) {
        /*
        byte    : sadece tam sayi degeri alir - 8 bit
        short   : sadece tam sayi degeri alir - 16 bit
        int     : sadece tam sayi degeri alir - 32 bit
        long    : sadece tam sayi degeri alir - 64 bit

        float   : ondalikli sayi degeri alir - sonuna f koymak zorunlu
        double  : ondalikli sayi degeri alir - sonuna d koyulabilir

        double>float>long>int>short>byte

        boolean : true/false verir
        char    : tek tirnak icinde tek karakter - tirnak icinde olmadan sayi(ASCII)
        */

        byte b1 = Byte.MAX_VALUE;
        System.out.println("b1 = " + b1);

        long l1= Long.MAX_VALUE;
        System.out.println("l1 = " + l1); //soutv kisa komutu degerle yazdirir

    }
}
