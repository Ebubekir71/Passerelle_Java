package ders05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C03_MatematikselIslemler_Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamakli pozitiv bir tamsayi girin");
        int sayi = scan.nextInt();
        int birlerBas = 0;
        int rakamlarToplami = 0;

        birlerBas = sayi%10;
        rakamlarToplami= rakamlarToplami+birlerBas;
        sayi = sayi/10;

        birlerBas = sayi%10;
        rakamlarToplami = rakamlarToplami + birlerBas;
        sayi = sayi/10;

        birlerBas = sayi%10;
        rakamlarToplami = rakamlarToplami + birlerBas;
        sayi = sayi/10;

        birlerBas = sayi%10;
        rakamlarToplami = rakamlarToplami + birlerBas;
        sayi = sayi/10;

        System.out.println(rakamlarToplami);

    }
}
