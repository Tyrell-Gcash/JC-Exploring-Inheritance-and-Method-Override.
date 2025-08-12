package org.example;

public class Exercise4 {
}

// Parent class
class BankAccount {
    private double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deductBalance(double fee){
        balance = balance - fee;
    }
}

// Child class
class CheckingAccount extends BankAccount {
    private double fee = 5.0;

    public CheckingAccount(double startingBalance) {
        super(startingBalance);
    }

    public void deductMonthlyFee() {
        super.deductBalance(fee);
        System.out.println("Fee deducted. New balance: " + getBalance());
    }
}