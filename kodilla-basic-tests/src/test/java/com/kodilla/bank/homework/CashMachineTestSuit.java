package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine machine1 = new CashMachine();
        double trs = machine1.getOperations();
        assertEquals(0, trs);
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

        int operations = machine1.getOperations(); // działa tak samo jak "machine1.getOperations()" w linii 52

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

        assertEquals(100, machine1.getBalance(), 0.0001);
        machine1.add(-20.00);
        assertEquals(80, machine1.getBalance(), 0.0001);
    }
    @Test
    public void cashInSaldo() {
        CashMachine machine1 = new CashMachine();
        machine1.add(200.00);
        machine1.add(1300.00);
        machine1.add(-850.00);

        assertEquals(1500, machine1.getCashIn(), 0.0001);
        machine1.add(10.00);
        assertEquals(1510, machine1.getCashIn(), 0.0001);
        machine1.add(-10.00);
        assertEquals(1510, machine1.getCashIn(), 0.0001);
    }
    @Test
    public void cashOutSaldo() {
        CashMachine machine1 = new CashMachine();
        machine1.add(200.00);
        machine1.add(1300.00);
        machine1.add(-850.00);

        assertEquals(-850, machine1.getCashOut(), 0.0001);
        machine1.add(10.00);
        assertEquals(-850, machine1.getCashOut(), 0.0001);
        machine1.add(-10.00);
        assertEquals(-860, machine1.getCashOut(), 0.0001);
    }
}