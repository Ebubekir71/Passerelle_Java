package ders04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip , bunlari birbirine bölüp,
        // sonucu double olarak yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölünecek tam sayiyi girin");
        int tamsayi1 = scan.nextInt();
        System.out.println("Lütfen bölecek tam sayiyi girin");
        int tamsayi2 = scan.nextInt();
        System.out.println("Girilen tam sayi : " + ((double)tamsayi1/(double)tamsayi2));
        //Java önce sag tarafi yapar
        //sagdaki rakamlardan birisini bile double yapsan yine double cikar sonuc.

    }
}
