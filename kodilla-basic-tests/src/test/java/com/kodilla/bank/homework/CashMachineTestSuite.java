package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void isDepositCalculatedWell (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(400);
        assertEquals(400,cashMachine.getSaldo(), 0.01);
    }
    @Test
    public void isWithdrawalCalculatedWell (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-200);
        assertEquals(-200,cashMachine.getSaldo(), 0.01);
    }
    @Test
    public void IsAverageCalculatedWell(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(400);
        cashMachine.add(-400);
        cashMachine.add(-200);
        assertEquals(0, cashMachine.getAverage(), 0.01);

    }
    @Test
    public void IsDepositsCountCorrect(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(400);
        cashMachine.add(-400);
        cashMachine.add(-200);
        assertEquals(2, cashMachine.getDepositsCount(), 0.01);

    }
    @Test
    public void isWithdrawalCountCorrect(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(400);
        cashMachine.add(-400);
        cashMachine.add(-200);
        assertEquals(2, cashMachine.getWithdrawalCount(), 0.01);
    }

}
