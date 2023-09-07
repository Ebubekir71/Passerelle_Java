package AA_Urun_Fiyat;

public class Product {
    public void calculate(double productPrice,
                          double productPrice2,
                          double productPrice3){

        String productName = "HD Dirve";
        String productName2= "TV Samsung";
        String productName3= "Playstation";
        double reducedPrice = productPrice-(productPrice/10);
        double reducedPrice2 = productPrice2-(productPrice2/10);
        double reducedPrice3 = productPrice3-(productPrice3/10);
        System.out.println(productName+ "First price = " + productPrice +
                            " Reduced price = " + reducedPrice);
        System.out.println(productName2+ "First price = " + productPrice2 +
                " Reduced price = " + reducedPrice2);
        System.out.println(productName3+ "First price = " + productPrice3 +
                " Reduced price = " + reducedPrice3);
    }

}
