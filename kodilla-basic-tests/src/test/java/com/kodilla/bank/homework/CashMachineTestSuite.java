package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        double machines = CashMachine.getDepositsCount();
        assertEquals(0, machines.length);
    }

    @Test
    public void shouldAddMachinesToArray() {
        CashMachine cashMachine = new CashMachine();

    }
}
