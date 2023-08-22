package ders08_If_Else;

import java.util.Scanner;

public class C04_Ogr_Notu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ögrencinin notunu girin");
        int not = scan.nextInt();
        if (not>100 || not<0){                  /* || or anlamindadir "yada" */
                                                /* or iyimserdir birisi olsun yeter*/
            System.out.println("Gecersiz not girisi");
        }else if(not>=85){
            System.out.println("Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        }else{
            System.out.println("Sinifta kaldin :D");
        }
    }
}
