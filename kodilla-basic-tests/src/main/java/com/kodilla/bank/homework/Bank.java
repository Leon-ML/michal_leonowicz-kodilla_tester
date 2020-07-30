package com.kodilla.bank.homework;

public class Bank {

    private CashMachine deposit;
    private CashMachine withdrawal;
    private int number;

    public Transaction(int value) {
        if (value > 0)
    }

    public Account(int number) {
        this.number = number;
        this.deposit = new CashMachine();
        this.withdrawal = new CashMachine();
    }

    public void makeATransaction(int value) {
        if (value > 0) {
            this.deposit.add(value);
        } else if (value < 0) {
            this.withdrawal.add(value);
        } else {
            return;
        }
    }
}
