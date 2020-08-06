package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public double getSaldo() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }

    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum / this.values.length;
    }

    public double getDeposits() {
        double Saldo0 = 0;
        for (int Deposit : values) {
            if (Deposit > 0) {
                Saldo0 += Deposit;
            }
        }
        return Saldo0;
    }
    public double getDepositsCount() {
        double count = 0;
        for (int Deposit : values) {
            if (Deposit > 0) {
                count++;
            }
        }
        return count;
    }
    public double getWithdrawals() {
        double Saldo0 = 0;
        for (int Withdrawal : values) {
            if (Withdrawal < 0) {
                Saldo0 += Withdrawal;
            }
        }
        return Saldo0;
    }
    public double getWithdrawalCount() {
        double count = 0;
        for (int Withdrawal : values) {
            if (Withdrawal < 0) {
                count++;
            }
        }
        return count;
    }
}

