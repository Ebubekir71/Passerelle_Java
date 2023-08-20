package ders06_Increment_Decrement;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(+ ++a);

        int b = a++;
        System.out.println(+ b);

        int c = b++ + a;

        System.out.println(+ c);
        System.out.println(+(a+b+c));



    }
}
