package AA_Denemeler;

public class C01_Engin_01 {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 45;
        int number3 = 50;
        int biggestNumber = 0;


        if (number1 > biggestNumber) {
            biggestNumber = number1;
            System.out.println(biggestNumber);
        }
        if (number2 > number1) {
            biggestNumber = number2;
            System.out.println(biggestNumber);
        }
        if (number3 > biggestNumber) {
            biggestNumber = number3;
            System.out.println(biggestNumber);
        }
        System.out.println(biggestNumber);
    }
}
