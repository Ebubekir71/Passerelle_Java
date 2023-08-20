package ders02_dataCasting;

import java.util.Scanner;

public class Ebubekir {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Dünya adini girin :");
        String dunya = scan.nextLine();

        System.out.println("ondalikli sayi girin");
        double sayi= scan.nextDouble();

        System.out.println("adres girin");
        String dcs = scan.next();

        System.out.println("dünya yilini girin");
        int yil = scan.nextInt();

        System.out.println("Girilen bilgiler"+ " " + dunya + " " + yil + " " + dcs + " " + sayi);




    }
}
