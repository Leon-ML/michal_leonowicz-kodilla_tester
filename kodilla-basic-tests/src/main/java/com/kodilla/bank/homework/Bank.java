package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] machines;
    private int size;

    public Bank() {
        this.size = 0;
        this.machines = new CashMachine[0];
    }

    public void addMachine(CashMachine machine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(machines, 0, newTab, 0, machines.length);
        newTab[this.size - 1] = machine;
        this.machines = newTab;
    }

    public double getSaldo() {
        double Saldo = 0;
        for (CashMachine machine : machines) {
            Saldo += machine.getSaldo();
        }
        return Saldo;
    }

    public double getAverageDeposits(){
        int sumDeposits = 0;
        double sumCounts = 0;
        for (CashMachine AverageSum:machines){
            sumDeposits += AverageSum.getDeposits();
            sumCounts += AverageSum.getDepositsCount();
        }
        return sumDeposits/sumCounts;
    }
}
