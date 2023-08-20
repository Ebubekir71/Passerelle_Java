package ders01_dataCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen Yasinizi Girin");
        int yas = scan.nextInt();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();


        System.out.println("Girilen Bilgiler : " + isim.charAt(0) + " " + soyIsim + " " + yas);

    }
}