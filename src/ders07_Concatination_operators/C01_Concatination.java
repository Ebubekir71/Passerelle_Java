package ders07_Concatination_operators;

public class C01_Concatination {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        String s1 = "Java";
        String s2 = " ";
        String s3 = "kolay";
        String s4 = "";
        System.out.println((a*b)+s2+s1+s2+s3);
        System.out.println((a+b)+s2+s1+s2+s3);
        System.out.println(""+a+b+s1+s3);// bekle
        System.out.println(s1+a*b+s3);
        System.out.println(s1+a+b+s3);
        System.out.println(s1+(a+b)+s3);
    }
}
