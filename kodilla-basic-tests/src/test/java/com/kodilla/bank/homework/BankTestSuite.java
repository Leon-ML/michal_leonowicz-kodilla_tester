package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
        public void shouldHaveZeroLength() {
            Bank bank = new Bank();
            int[] machines = Bank.addMachine();
            assertEquals(0, machines.length);
        }
    @Test
        public void shouldCalculateSaldo() {
            Bank bank = new Bank();
            bank.add(400)

    }

    }
