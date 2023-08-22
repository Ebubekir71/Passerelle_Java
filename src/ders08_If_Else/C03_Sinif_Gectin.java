package ders08_If_Else;

import java.util.Scanner;

public class C03_Sinif_Gectin {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        double not = scan.nextDouble();

        if (not<50){
            System.out.println("Sinifta kaldin");
        }else{
            System.out.println("Sinifi gectin");
        }
    }
}
