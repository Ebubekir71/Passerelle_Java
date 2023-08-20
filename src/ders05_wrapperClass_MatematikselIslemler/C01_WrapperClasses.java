package ders05_wrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {
    public static void main(String[] args){
        String str ="Java";
        System.out.println(str.toUpperCase());

        int sayip = 20 ;
                 //Primitiv data türlerinin hazir methodlari yoktur.

        // Wrapper Class'lar primitive data türleri ile ayni degerleri barindirirken
        // degerlerin yaninda hazir methodlar da kullanmamiza imkan veren classlardir.

        Integer sayiW=30;

        System.out.println(Integer.MAX_VALUE); //  2147483647
        System.out.println(Integer.MIN_VALUE); //  -2147483648

        char karakP= 'a';
        Character karekW= 'b';

        System.out.println(Character.isDigit(karekW));
        System.out.println(Character.isLetter(karekW));

        String sayi1 = "1456";
        String sayi2 = "1000";

        System.out.println(sayi2+sayi1);
        System.out.println(Integer.valueOf(sayi2)+ Integer.valueOf(sayi1));


    }
}
