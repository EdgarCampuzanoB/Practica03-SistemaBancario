package com.example.springcoredojo.banco;

import org.springframework.stereotype.Component;

@Component
public class SavingsAccount implements Accounts{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double depositToAnAccount(double amount) {
        return 0;
    }

    @Override
    public double withdrawFromAccount(double amount) {
        try {
            if (this.balance > amount){
                this.balance -= amount;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return balance;
    }

    @Override
    public double discountAccountManagement() {
        return 0;
    }
}
