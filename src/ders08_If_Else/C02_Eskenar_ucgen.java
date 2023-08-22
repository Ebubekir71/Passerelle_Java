package ders07_If_Else;

import java.util.Scanner;

public class C02_Eskenar_ucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ücgenin üc \nkenar uzunlugunu girin");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1==kenar2 &&kenar2==kenar3){           /*Java ikili karsilastirma yapar*/
            System.out.println("Eskenar Ücgendir");
        }else{
            System.out.println("Eskenar Ücgen Degildir");
        }
    }
}
