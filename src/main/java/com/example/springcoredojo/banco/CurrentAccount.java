package com.example.springcoredojo.banco;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount  implements Accounts{
    private double balance;

    @Override
    public double depositToAnAccount(double amount) {
        balance += amount;
        return balance;
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
