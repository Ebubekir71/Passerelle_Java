package ders05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C04_Matematiksel_Islemler_Deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen poziif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        int birlerBas = 0;
        int rakamlarToplami = 0;

        while (sayi!=0){
            birlerBas = sayi%10;
            rakamlarToplami = rakamlarToplami + birlerBas ;
            sayi = sayi/10;
        }
        System.out.println(rakamlarToplami);
    }
}
