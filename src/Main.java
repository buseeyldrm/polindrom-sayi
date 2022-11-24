import java.util.Scanner;

public class Main {


    static boolean isPolindrom(int sayi) {
        int temp = sayi;
        int tersSayi = 0;
        int sonSayi ;


        while (temp != 0) {
            System.out.println("Sayı: " + temp);
            sonSayi = temp % 10;
            System.out.println("Son Basamak: " + sonSayi);
            tersSayi = (tersSayi * 10) + sonSayi;
            System.out.println("Yeni Sayı: " + tersSayi);
            temp /= 10;

        }
        if (sayi == tersSayi)
            return true;
    
        else 
            return false;

    }

    public static void main(String[] args) {
        System.err.println(isPolindrom(400));



    }
}