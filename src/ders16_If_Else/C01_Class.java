package ders16_If_Else;

import java.util.Scanner;

public class C01_Class {

    public static int getAverege(int value1, int value2, int value3, int value4){
        int averege =0;
        averege = (value1+value2+value3+value4)/4;
        System.out.println(averege+ " averege number");
        return averege;
    }
    public static int smallestValue(int value1, int value2, int value3, int value4){
        int smallest=value1;
        if (value2<smallest){
            smallest=value2;
        }
        if (value3<smallest){
            smallest=value3;
        }
        if (value4<smallest){
            smallest=value4;
        }
        return smallest;
    }
    public static int largestValue(int value1, int value2, int value3, int value4){
        int largest=value1;
        if (value1>largest){
            largest=value1;
        }
        if (value2>largest){
            largest=value2;
        }
        if (value3>largest){
            largest=value3;
        }
        if (value4>largest){
            largest=value4;
        }
        return largest;
    }
    public static int minusRange(int largest, int smallest){

        int range =0;
        range = largest- smallest;
        System.out.println(range);
        return range;
    }

}
