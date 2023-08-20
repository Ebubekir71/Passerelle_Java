package ders06_Increment_Decrement;

import java.util.Scanner;

public class C01_Increment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üc basamakli pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int birlerBas = 0;
        int rakamlarTop = 0;

        while (sayi!=0) {
            birlerBas = sayi%10;
            rakamlarTop = rakamlarTop + birlerBas;
            sayi = sayi/10;
        }
        System.out.println(rakamlarTop);




    }
}
