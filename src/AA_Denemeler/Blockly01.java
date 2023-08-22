package AA_Denemeler;

import java.util.Scanner;

public class Blockly01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year that bigger than 1581");
        int year = scan.nextInt();

        if (year > 1581){
             if (year%4!=0){
                System.out.println(year + " is not a leap year, as it is not divisible by 4");
            } else if (year%100!=0) {
                System.out.println(year + " is a leap year");
            } else if (year%400!=0) {
                System.out.println(year + " is not a leap year, as it is divisible by 100");
            } else{
                System.out.println(year + " is a leap year");
            }
        }else{
            System.out.println(year + " is not a valid year");
        }
    }
}
