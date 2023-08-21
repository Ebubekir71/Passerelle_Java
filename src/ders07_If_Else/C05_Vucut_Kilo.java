package ders07_If_Else;

import java.util.Scanner;

public class C05_Vucut_Kilo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu cm olarak giriniz");
        double boy = scan.nextDouble();

        double VucutKiloEndeks = (kilo*10000)/(boy*boy);
        System.out.println("Vücut kilo endeksiniz :" + VucutKiloEndeks);

        if (VucutKiloEndeks>30){
            System.out.println("Obez");
        } else if (VucutKiloEndeks>25) {
            System.out.println("Kilolu");
        } else if (VucutKiloEndeks>=20) {
            System.out.println("Normal");
        } else if (VucutKiloEndeks<=20) {
            System.out.println("Zayif");
        }else {
            System.out.println("Gecersiz Giris Yapildi");
        }
    }
}
