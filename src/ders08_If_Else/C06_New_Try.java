package ders08_If_Else;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C06_New_Try {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int a = scan.nextInt();

//        a = a>0 ? a*2 : a+10;
//        System.out.println(a);            Ternary ifadesi kullanilarak yazilan bir koddur

        if (a>0){
            System.out.println(a*2);
        }else{
            System.out.println(a+12);
        }
    }
}
