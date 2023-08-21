package ders07_If;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        /*Kullanicidan bir harf alin, harf ile baslayan bir aay varsa yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char ilkharf = scan.next().charAt(0);

        if (ilkharf=='o' || ilkharf=='0'){
            System.out.println("Ocak");
        }if (ilkharf=='s' || ilkharf=='S'){
            System.out.println("Subat");
        }if (ilkharf=='m' || ilkharf=='M'){
            System.out.println("Mart, Mayis");
        }if (ilkharf=='n' || ilkharf=='N'){
            System.out.println("Nisan");
        }if (ilkharf=='h' || ilkharf=='H'){
            System.out.println("Haziran");
        }if (ilkharf=='t' || ilkharf=='T'){
            System.out.println("Temmuz");
        }if (ilkharf=='a' || ilkharf=='A'){
            System.out.println("Agustos, Aralik");
        }if (ilkharf=='e' || ilkharf=='E'){
            System.out.println("Eylül, Ekim");
        }if (ilkharf=='k' || ilkharf=='K'){
            System.out.println("Kasim");
        }
    }
}
