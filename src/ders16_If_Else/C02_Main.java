package ders16_If_Else;

import java.util.Scanner;

public class C02_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write 4 value");
        int value1= scan.nextInt();
        int value2= scan.nextInt();
        int value3= scan.nextInt();
        int value4= scan.nextInt();
        System.out.println(value1+" "+value2+" "+value3+" "+value4);
        C01_Class.getAverege(value1, value2, value3, value4);
        System.out.println(C01_Class.smallestValue(value1, value2, value3, value4)+ " smallest number");
        System.out.println(C01_Class.largestValue(value1, value2, value3, value4) + " largest number");
        int range = 0;
        range= C01_Class.largestValue(value1, value2,value3,value4)-C01_Class.smallestValue(value1, value2,value3,value4);
        System.out.println(range+ " range");

    }
}
