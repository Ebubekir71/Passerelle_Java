package ders12_BankAccount;

public class Account {
    private double balance=0.0;

    public void deposit(double amount){
        balance=balance+amount;

    }
    public void withdraw(double amount){
        balance = balance-amount;
    }
    public double getBalance(){
        return balance;
    }
}
