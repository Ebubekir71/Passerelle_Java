package ders13_BankAccount;

public class Hesap {
    double balance =0;
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Not enough money left");
        }else{
            balance = balance-amount;

        }

    }
    public  double getBalance(){
        return balance;
    }
}
