package ders10_Switch_Statements;

import java.util.Scanner;

public class C04_Switch_Statements_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün numarasi giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta Ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecersiz gün numarasi");
        }
    }
}
