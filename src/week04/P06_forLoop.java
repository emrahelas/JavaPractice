package week04;

public class P06_forLoop {
    public static void main(String[] args) {
        /*
            Verilen  bir pozitif tam sayının
            pozitif tam bölenlerini yazdırın.
         */

        int sayi = 100000;
        int bolen=0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                System.out.print(i+" ");
            }

        }

    }
}
