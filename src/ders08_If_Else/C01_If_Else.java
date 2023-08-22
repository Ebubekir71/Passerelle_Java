package ders08_If_Else;

import java.util.Scanner;

public class C01_If_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen not giriniz");
        double not = scan.nextDouble();

        if (not<=45){
            System.out.println("Dersten kaldin");
        }else{
            System.out.println("Dersten gectin");
        }
    }
}
