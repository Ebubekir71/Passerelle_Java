package ders07_If;

import java.util.Scanner;

public class C03_If_Statements {
    public static void main(String[] args) {
        /*Kullanicidan bir sayi alin sayi üc ile bölünebiliyorsa "üc ile bölünebilen sayi",
         5 ile bölünebilen sayi ise "5 ile bölünebilen sayi" yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();
        /*If cümlesinden sonra { } kullanilirsa if sarti saglandiginda
         { } ici tamamen calistirilir. Saglanmazsa { } ici hic
         calistirilmaz. Ancak { } kullanilmazsa java if body si olarak
         if sartindan sonra ilk ; kadar olan kismi alir geriye kalan kodlar if
         cümlesi ile ilgili olmaz*/
        if (sayi % 3 == 0){
            System.out.println("Üc ile bölünebilen sayidir");
        }if (sayi %5 == 0){
            System.out.println("Bes ile bölünebilen sayi");
        }
    }
}
