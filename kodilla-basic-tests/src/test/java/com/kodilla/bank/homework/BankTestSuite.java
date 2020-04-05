package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void averageShouldBeZeroIfCashMashineDontHaveOperations() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds", new CashMachine[]{cm1, cm2, cm3});

        assertEquals(0, lloyds.operationsTotal(), 0.0001);
    }


    @Test
    public void shouldCalculateCorrectAveragesIfAmountsAreInRange() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds", new CashMachine[]{cm1, cm2, cm3});

        cm1.add(100.00);
        cm1.add(-20.00);

        double ba = cm1.getBalance(); //TODO: test getBankBalance z lloyds.get

        assertEquals(80, (double) ba, 0.0001);   //WRONG !!!! - OK -po importowaniu assertEquals z innymi parametrami
    }

    @Test
    public void numberOperationsInOut() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds", new CashMachine[]{cm1, cm2, cm3}); // TODO - sprawdzić kolejność przypisywania cm -> lloyds vs. lloyds -> cm do []
        cm1.add(100.00);
        cm1.add(100.00);
        cm2.add(100.00);
        cm3.add(100.00);
        cm3.add(-100.00);

        assertEquals(2, cm1.getOperationsIn(), 0.0001);
        assertEquals(1, cm3.getOperationsOut(), 0.0001);
        assertEquals(1, cm3.getOperationsIn(), 0.0001);
        assertEquals(2, cm3.getOperations(), 0.0001);
        assertEquals(1, cm2.getOperations(), 0.0001);
        assertEquals(0, cm2.getOperationsOut(), 0.0001);

        assertEquals(5, lloyds.operationsTotal() );  // OK !!
    }

    @Test
    public void bankBalance() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds" , new CashMachine[] {cm1, cm2, cm3});
        cm1.add(100.00);
        cm2.add(100.00);
        cm3.add(100.00);
        cm3.add(-100.00);

        assertEquals(200, lloyds.getBankBalance(), 0.0001);
    }
}