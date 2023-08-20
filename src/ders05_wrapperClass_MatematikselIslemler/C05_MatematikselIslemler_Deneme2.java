package ders05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C05_MatematikselIslemler_Deneme2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adinizi Giriniz");
        String name = scan.nextLine();
        System.out.println("lütfen 3 basamakli pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int birlerBas = 0;
        int rakamlarTop = 0;

        while (sayi != 0) {
            birlerBas = sayi%10;
            rakamlarTop = rakamlarTop + birlerBas;
            sayi = sayi/10;
        }
        System.out.println(rakamlarTop);
    }
}
