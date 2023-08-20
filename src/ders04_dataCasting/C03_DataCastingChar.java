package ders04_dataCasting;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {

        int a = 'a' + 'b';

        System.out.println(a); //97+98=195 i verir ASCII tablosuna göre
        System.out.println('a'+'b'); //195 //buradada ASCII tablosuna göre islem yapar
        System.out.println(""+ 'a'+'b'); //ab burada bastaki string ifadesi güclü oldugundan yan yana koyar

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");
        char girilenkarakter = scan.next().charAt(0);
        System.out.println("Girilen karakter" + girilenkarakter);
        System.out.println("girilen karakterin bir sonrasi : " +(char)(girilenkarakter+1));
        System.out.println("girilen karakterin bir sonrasi : " +(char)(girilenkarakter+2));
        System.out.println("girilen karakterin bir sonrasi : " +(char)(girilenkarakter+3));
    }
}
