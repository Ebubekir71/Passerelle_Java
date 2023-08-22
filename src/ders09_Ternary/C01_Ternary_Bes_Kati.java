package ders09_Ternary;

import java.util.Scanner;

public class C01_Ternary_Bes_Kati {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin kontrol edip 5 ile bölünebiliyorsa "Sayi 5'in tam kati yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();

        if (a%5==0){
            System.out.println("sayi 5'in tam katidir");
        }else{
            System.out.println("5' in katlari olmayan bir sayi giriyorsunuz");
        }

    }
}
