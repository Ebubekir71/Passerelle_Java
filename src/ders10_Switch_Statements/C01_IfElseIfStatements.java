package ders10_Switch_Statements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün numarasini giriniz");
        int number = scan.nextInt();
        if (number<0 || number>7){
            System.out.println("Gecersiz gün numarasi");
        }else if(number==1){
            System.out.println("Pazartesi");
        }else if(number==2){
            System.out.println("Sali");
        }else if(number==3){
            System.out.println("Corsamba");
        }else if(number==4){
            System.out.println("Persembe");
        }else if(number==5){
            System.out.println("Cuma");
        }else if(number==6){
            System.out.println("Cumartesi");
        }else if(number==7){
            System.out.println("Pazar");
        }
    }
}
