package ders07_If;

import java.util.Scanner;

public class C01_if {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi%5==0){
            System.out.println("Sayi 5 in tam katidir.");
        }
    }
}
