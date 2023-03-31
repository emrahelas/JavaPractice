package week04;

public class P05_forLoop {
    public static void main(String[] args) {
        /*
            Verilen String'deki kullanılan harfleri, kelimeyi ve tekrarsız
            halini yazdırıp kelimede kullanılan farklı harf sayısını yazdırın.
         */

        String str = "m*e*r*h*a*b*";
        String tekrarsiz = "";
        String islenecekKelime = str.replaceAll("\\W", "");
        System.out.print(str.substring(0, 1));
        tekrarsiz = islenecekKelime.substring(0, 1);

        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!tekrarsiz.contains((islenecekKelime.substring(i, i + 1)))) {
                System.out.print("," + islenecekKelime.substring(i, i + 1));
                tekrarsiz += islenecekKelime.substring(i, i + 1);
            }


        }



    }
}
