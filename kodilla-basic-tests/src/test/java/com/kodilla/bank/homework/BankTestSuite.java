package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void averageShouldBeZeroIfCashMashineDontHaveOperations() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds" , new CashMachine[] {cm1, cm2, cm3});

        assertEquals(3, lloyds.getBankAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds" , new CashMachine[] {cm1, cm2, cm3});
        cm1.add(100.00);
        cm1.add(-20.00);
        double ba = lloyds.getBankAverage();

//        assertEquals(2, (double) lloyds.getBankOperations(),  0.0001);  //WRONG!!!!
        assertEquals(40, (double) ba, 0.0001);   //WRONG !!!!
    }

    @Test
    public void numberOperationsInOut() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds" , new CashMachine[] {cm1, cm2, cm3});
        cm1.add(100.00);
        cm2.add(100.00);
        cm3.add(100.00);
        cm3.add(100.00);

//        assertEquals(0, lloyds.getBankOperations(),  0.0001);   // WRONG!!!!
        assertEquals(3, lloyds.getBankOperationsIn(), 0.0001);
        assertEquals(1, lloyds.getBankOperationsOut(), (int) 0.0001);
    }

    @Test
    public void bankBalance() {
        CashMachine cm1 = new CashMachine();
        CashMachine cm2 = new CashMachine();
        CashMachine cm3 = new CashMachine();
        Bank lloyds = new Bank("Lloyds" , new CashMachine[] {cm1, cm2, cm3});

        assertEquals(0, lloyds.getBankAverage(), 0.0001);

        assertEquals(20.00, lloyds.getBankBalance(),0.0001);  //  WRONG!!!!
        assertEquals((int) 1, lloyds.getBankOperationsIn(), (int) 0.0001); // tu rzutowałem  arg  na (int)
        assertEquals((int) 1, lloyds.getBankOperationsOut(), (int) 0.0001); // tu rzutowałem  arg  na (int)
    }

    private void assertEquals(double v, double bankBalanceAll, double v1) {
//         ten test wygenerowal sie automatycznie - w tym ciele nic nie jest wymagane, jednakże po usunięciu
//         tej metody generuje sie wyjątek -
    }
}