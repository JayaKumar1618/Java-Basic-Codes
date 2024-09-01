package jaya;

import java.util.Scanner;

class ATM1 {
    private double balance;

    public ATM1() {
        this.balance = 10000.0;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal amount exceeds current balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter an amount greater than zero.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class jk55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        
        System.out.println("Welcome to the ATM!");
        atm.checkBalance();
        
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        atm.withdraw(amount);
        atm.checkBalance();
        
    }
}
