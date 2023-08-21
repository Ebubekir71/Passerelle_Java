package ders07_Concatination_operators;

import java.util.Scanner;

public class C02_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hava durumu bilgisi girin");
        int havaDurumu = scan.nextInt();

        if (havaDurumu>= 0) {
            System.out.println("Yagmur yagacak");
        }else{
            System.out.println("yagmur yagmayacak");
        }
    }
}
