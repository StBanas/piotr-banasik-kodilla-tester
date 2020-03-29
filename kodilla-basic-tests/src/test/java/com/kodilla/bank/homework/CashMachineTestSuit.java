package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine machine1 = new CashMachine();
        double [] balance = machine1.getBalance();
        assertEquals(0, balance.length);
    }

    @Test
    public void shouldAddSomeElementsToArray() {
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();
        machine1.add(440.30);
        machine1.add(1222.50);
        machine1.add(1.50);

        machine2.add(100.00);
        machine2.add(120.00);
        machine2.add(80.00);
        machine2.add(20.00);

        double[] balance1 = machine1.getBalance();
        assertEquals(3, balance1.length);
        assertEquals(440.3, balance1[0]);
        assertEquals(1222.50, balance1[1]);
        assertEquals(1.50, balance1[2]);

        double[] balance2 = machine2.getBalance();
        assertEquals(4, balance2.length);
        assertEquals(120.00, balance2[1]);
        assertEquals(20.00, balance2[3]);
    }

    @Test
    public void shouldCalcAverage() {
        CashMachine machine = new CashMachine();
        machine.add(100.0);
        machine.add(120.0);
        machine.add(140.0);

        assertEquals(120, machine.getAverage(), 0.01);
    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine machine1 = new CashMachine();
        assertEquals(0, machine1.getAverage(), 0.0001);
    }
    @Test
    public void numberOpertions() {
        CashMachine machine1 = new CashMachine();
        machine1.add(100);
        machine1.add(100);
        machine1.add(-100);

        int operations = machine1.getOperations(); // działa tak samo w linii 63 z

        assertEquals(3, operations, 0.0001);
        assertEquals(2, machine1.getOperationsIn(), 0.0001);
        assertEquals(1, machine1.getOperationsOut(), 0.0001);
    }
    @Test
    public void cashInCashOut() {
        CashMachine machine1 = new CashMachine();
        machine1.add(100.00);
        machine1.add(100.00);
        machine1.add(-100.00);

        assertEquals(2, machine1.getOperationsIn(), 0.0001);
        assertEquals(1, machine1.getOperationsOut(), 0.0001);
    }
}