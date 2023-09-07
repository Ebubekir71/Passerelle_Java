package ders15_BankAcocount;

public class Main {
    public static void main(String[] args) {
        Baglam baglam = new Baglam();
        double sonuc = baglam.withdraw(100);

        sonuc= baglam.deposit(250.0);
        System.out.println(sonuc);
    }
}
