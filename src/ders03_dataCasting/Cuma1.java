package ders03_dataCasting;

import java.util.Scanner;

public class Cuma1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bilgilerinizi Gitiniz");
        System.out.println("Lütfen Adinizi Giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen Soyadinizi Giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("Lütfen Yasinizi Giriniz");
        int yas = scan.nextInt();

        System.out.println("Girdiginiz bilgiler dogru ise onaylayiniz : " + isim.charAt(0) + " "
                            + soyIsim + " " + yas);
    }

}
