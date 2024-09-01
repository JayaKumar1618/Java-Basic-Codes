package jaya;

import java.util.Scanner;

class ATM {
    private double balance;

    public ATM() {
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

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter an amount greater than zero.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Amount deposited: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class jk54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        
        System.out.println("Welcome to the ATM!");
        atm.checkBalance();
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        atm.deposit(depositAmount);
        atm.checkBalance();
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        atm.withdraw(withdrawAmount);
        atm.checkBalance();
        
    }
}
