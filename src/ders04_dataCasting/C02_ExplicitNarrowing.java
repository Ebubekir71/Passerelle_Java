package ders04_dataCasting;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int a = 135;
        byte b = (byte)a;
        System.out.println(b);


        /*daha genis sayisal data türünü daha dar kapsamliya explicit narrowing ile casting yapmak istersek
        java cevirmek istedigimiz data türünün sinirlari icerisinde tekrar tekrar dönecektir*/
    }
}
