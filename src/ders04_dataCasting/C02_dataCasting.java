package ders04_dataCasting;

public class C02_dataCasting {
    public static void main(String[] args){
        int a=134;
        double b=23.4;
        short c = 34;
        byte d = 14;

                        //byte < short < int < long < float < double

        double e = a;       //burada a = int oldugu icin double in icine koyabilirsin.
        int f = c;      // burada c = short oldugu icin int icerisine koyabilirsin

                        //Illa ben büyük olani kücügün icerisine koyacagim diyorsan o zaman

        short h = (short) b;    // burada b = double zorlayarak short un
                                // icerisine konabilir fakat rakamlari kesebilir aldigi kadarini gösterir

        /* biz daha kapsamli data türündeki bir degeri, daha
         dar kapsamli bir variable a atamak istersek java bunu yapmayacaktir.*/
        /*Cünkü daha kapsamliyi, daha dar kapsamli bir türe cevirmek istiyorsunuz
         data kayiplari olabilir vaya java datayi yeni data türüne cevirmek icin degistirebilir.*/
        /* byte -128 - 127 arasi rakamlari alir icerisine */
    }
}
