package AA_Denemeler;

import java.util.Scanner;

public class Blockly02 {
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter positive decimal number");
        int number= scann.nextInt();

        if (number>=0){
            int sum = 0 ;
            while(number>0){
                int digit = number%10;
                sum = sum+ digit;
                number = number / 10;
            }
            System.out.println("Digit number : " + sum);
        }else{
            System.out.println("This is no positive number");
        }
    }
}
