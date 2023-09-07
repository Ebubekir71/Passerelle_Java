package ders15_BankAcocount;

public class Baglam {
    double balance =0;

    public double withdraw(double amount){
        balance= balance-amount;
        return balance;
    }
    public double deposit(double amount){
        balance=balance+amount;
        return balance;
    }
}
