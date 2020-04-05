package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();

        Bank bank = new Bank("bank", new CashMachine[]{cm1,cm2,cm3});
        double[] transaction = cm1.getTransaction();
        cm1.add(0);
        cm1.add(20);
        assertEquals(2, cm1.getTransactionLength());
    }

    @Test
    public void shouldAddSomeElementsToArray() {

        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();

        Bank bank = new Bank("bank", new CashMachine[]{cm1,cm2,cm3});
        cm1.add(1000);
        cm1.add(100);

        assertEquals(2, cm1.getTransactionLength());
        assertEquals(2, cm1.getTransactionLength(), 0.0001);
    }

    @Test
    public void shouldCalcAverage() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("LLoyds", new CashMachine[]{cm1,cm2,cm3});
        cm1.add(2);
        cm1.add(2);

        cm2.add(100.0);
        cm2.add(-120.0);

        assertEquals(4, cm1.getBalance(), 0.01);
        assertEquals(-20, cm2.getBalance(), 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfArrayIsEmpty() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("LLoyds", new CashMachine[]{cm1,cm2,cm3});
//        cm1.add();
//        cm2.add(100.0);
//        cm3.add(34);
        assertEquals(0, cm3.getAverage(), 0.0001);
    }

    @Test
    public void numberOpertionsInOrOut() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("LLoyds", new CashMachine[]{cm1,cm2,cm3});
        cm1.add(2);
        cm1.add(-1100);

        cm2.add(100.0);
        cm2.add(-10);

        cm3.add(34);
        cm3.add(12);
        cm3.add(-100);

        assertEquals(1, cm1.getOperationsIn(), 0.0001);
        assertEquals(1, cm2.getOperationsOut(), 0.0001);
        assertEquals(3, cm3.getOperations(), 0.0001);
    }

    @Test
    public void cashInAndCashOut() {
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

    @Test
    public void averageCashIn() {
        CashMachine machine1 = new CashMachine();
        machine1.add(100.00);
        machine1.add(100.00);
        machine1.add(400.00);
        machine1.add(-100.00);
        machine1.add(-120.00);
        machine1.add(-200.00);

//        double result = machine1.getCashIn()/machine1.getOperationsIn();  == też działa poprawnie
//        assertEquals(200, result, 0.0001);

        assertEquals(200, machine1.getAverageIn(), 0.0001);
        machine1.add(-220.00);
        assertEquals(200, machine1.getAverageIn(), 0.0001);

    }
    @Test       // brakowało tego nagłówka == dlatego  nie testował
    public void averageCashOut() {
        CashMachine machine1 = new CashMachine();
        machine1.add(100.00);
        machine1.add(100.00);
        machine1.add(400.00);
        machine1.add(-100.00);
        machine1.add(-120.00);
        machine1.add(-200.00);

        double result = machine1.getCashOut()/machine1.getOperationsOut();
        assertEquals(-140, result, 0.0001);

        assertEquals(-140, machine1.getAverageOut(), 0.0001);
        machine1.add(-300.00);
        assertEquals(-180, machine1.getAverageOut(), 0.0001); // tu powinien mi wywalić wyjątek "z hukiem"
    }
}