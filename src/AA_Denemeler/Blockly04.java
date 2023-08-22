package AA_Denemeler;

import java.util.Scanner;

public class Blockly04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive decimal number");
        int number = scan.nextInt();

        if (number>=0){
            String result = " ";
            if (number == 0){
                result = "0";
            }while (number>0){
                int digit = number % 2 ;
                result = digit + result;
                number = number / 2 ;
            }
            System.out.println("Binary value " + result);
        }else{
            System.out.println("This is no pisitive decimal number");
        }
    }
}
