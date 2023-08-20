package ders05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_Matematiksel_Islemler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir sayi girin");
        int sayi = scan.nextInt(); //123
        int birlerBas= 0;
        int rakamlarTop= 0;
                // 3 Basamak icin bu islemi 3 kere yapmamiz gerekir
                //girilen sayinin birler basamagindaki 3 icin
        birlerBas= sayi%10;
        rakamlarTop = rakamlarTop + birlerBas; //0+3
        sayi = sayi/10; // 12

                //girilen sayinin onlar basamagindaki 2 icin

        birlerBas = sayi%10;   // 12%10= 2
        rakamlarTop = rakamlarTop + birlerBas; //3+2
        sayi = sayi/10;         // 12/10=1.2==>1

                //girilen sayinin yüzler basamagindaki 1 icin

        birlerBas =sayi%10;
        rakamlarTop = rakamlarTop + birlerBas; // 3+2+1
        sayi = sayi/10;     // 1/10 =0.1 ==>0

        System.out.println(rakamlarTop);
    }
}
