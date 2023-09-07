package ders13_BankAccount;

public class AnaSayfa {
    public static void main(String[] args) {
        Hesap ayse = new Hesap();
        Hesap mehmet = new Hesap();
        mehmet.deposit(100.0);
        mehmet.deposit(650.0);
        ayse.deposit(500.00);
        ayse.withdraw(200.0);


        System.out.println("Mehmetin balansi "+mehmet.getBalance());
        System.out.println("Aysenin balansi " +ayse.getBalance());
    }
}
