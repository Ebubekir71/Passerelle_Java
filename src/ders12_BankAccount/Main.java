package ders12_BankAccount;

public class Main {
    public static void main(String[] args) {
        Account aOksana = new Account();
        Account aInna = new Account();

        aOksana.deposit(2500.0);
        System.out.println("Konto Stand Oksana " + aOksana.getBalance());

        aOksana.withdraw(200.0);
        System.out.println("Konto Stand Oksana " + aOksana.getBalance());

        aInna.deposit(300);
        System.out.println("Konto Stand Inna " + aInna.getBalance());
    }
}
