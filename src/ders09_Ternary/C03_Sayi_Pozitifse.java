package ders09_Ternary;

import java.util.Scanner;

public class C03_Sayi_Pozitifse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int number = scan.nextInt();

        if (number>0){
            if (number%2==0){
                System.out.println(number + " sayisi cift sayidir.");
            }else{
                System.out.println(number + " sayisi cift sayi degildir.");
            }
        } else if (number<=-100 && number>-1000) {
            System.out.println(number + " sayisi 3 basamakli sayidir.");
        }else{
            System.out.println(number + " sayisi 3 basamakli bir sayi degildir.");
        }
    }
}
