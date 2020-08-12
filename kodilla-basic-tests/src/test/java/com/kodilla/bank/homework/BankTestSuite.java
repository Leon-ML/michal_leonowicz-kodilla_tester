package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {



    @Test
        public void shouldSaldoBe0IfNoCashmachine() {
            Bank bank = new Bank();
        double saldo = bank.getSaldo();
        assertEquals(0, saldo, 0.01);
    }
    @Test
    public void shouldSaldoBe0IfNoTransactions() {
        CashMachine cashMachine = new CashMachine();
        Bank bank = new Bank();
        bank.addMachine(cashMachine);
        double saldo = bank.getSaldo();
        assertEquals(0, saldo, 0.01);
    }
    @Test
    public void shouldSaldoBeCalculatedCorrectly(){
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(400);
        cashMachine1.add(-700);
        cashMachine2.add(2000);
        cashMachine2.add(-2000);
        Bank bank = new Bank();
        bank.addMachine(cashMachine1);
        bank.addMachine(cashMachine2);
        double saldo = bank.getSaldo();
        assertEquals(-300, saldo, 0.01);
    }
    @Test
    public void shouldAllDepositsBeCounted(){
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        cashMachine1.add(400);
        cashMachine1.add(-700);
        cashMachine1.add(700);
        cashMachine2.add(2000);
        cashMachine2.add(-2000);
        cashMachine2.add(1700);
        cashMachine3.add(1000);
        cashMachine3.add(-700);
        cashMachine3.add(100);
        cashMachine4.add(200);
        cashMachine4.add(900);
        Bank bank = new Bank();
        bank.addMachine(cashMachine1);
        bank.addMachine(cashMachine2);
        bank.addMachine(cashMachine3);
        bank.addMachine(cashMachine4);
        double counter = bank.getDepositsCount();
        assertEquals(8, counter, 0.01);
    }
    @Test
    public void shouldAllWithdrawalsBeCounted(){
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        cashMachine1.add(400);
        cashMachine1.add(-700);
        cashMachine1.add(700);
        cashMachine2.add(2000);
        cashMachine2.add(-2000);
        cashMachine2.add(1700);
        cashMachine3.add(1000);
        cashMachine3.add(-700);
        cashMachine3.add(100);
        cashMachine4.add(200);
        cashMachine4.add(900);
        Bank bank = new Bank();
        bank.addMachine(cashMachine1);
        bank.addMachine(cashMachine2);
        bank.addMachine(cashMachine3);
        bank.addMachine(cashMachine4);
        double counter = bank.getWithdrawalsCount();
        assertEquals(8, counter, 0.01);
    }
    @Test
    public void shouldAverageDepositBeCounted(){
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        cashMachine1.add(400);
        cashMachine1.add(-700);
        cashMachine1.add(700);
        cashMachine2.add(2000);
        cashMachine2.add(-2000);
        cashMachine2.add(1700);
        cashMachine3.add(1000);
        cashMachine3.add(-700);
        cashMachine3.add(100);
        cashMachine4.add(200);
        cashMachine4.add(900);
        Bank bank = new Bank();
        bank.addMachine(cashMachine1);
        bank.addMachine(cashMachine2);
        bank.addMachine(cashMachine3);
        bank.addMachine(cashMachine4);
        double average = bank.getAverageDeposits();
        assertEquals(0, average, 0.01);
    }
    @Test
    public void shouldAverageWithdrawalBeCounted(){
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        cashMachine1.add(400);
        cashMachine1.add(-700);
        cashMachine1.add(700);
        cashMachine2.add(2000);
        cashMachine2.add(-2000);
        cashMachine2.add(1700);
        cashMachine3.add(1000);
        cashMachine3.add(-700);
        cashMachine3.add(100);
        cashMachine4.add(200);
        cashMachine4.add(900);
        Bank bank = new Bank();
        bank.addMachine(cashMachine1);
        bank.addMachine(cashMachine2);
        bank.addMachine(cashMachine3);
        bank.addMachine(cashMachine4);
        double average = bank.getAverageWithdrawals();
        assertEquals(0, average, 0.01);
    }
    }
