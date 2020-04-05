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
        cm2.add(100.00);
        cm3.add(100.00);
        cm3.add(-100.00);

        int cm1_op_in = cm1.getOperationsIn();
        int cm3_op_in = cm3.getOperationsIn();
        int cm3_op_out = cm3.getOperationsOut();
        int cm3_op_total = cm3.getOperations();

        assertEquals(1, cm1.getOperationsIn(), 0.0001);
        assertEquals(1, cm3.getOperationsOut(), 0.0001);
        assertEquals(1, cm3.getOperationsIn(), 0.0001);
        assertEquals(2, cm3.getOperations(), 0.0001);

/* w poniższym zestawieniu mam ustawione gettery w taki sposób:

    public CashMachine getBankOperations () { return this.operations; }
    public int getBankOperationsIn () { return this.operationsIn.getOperationsIn(); }
    public int getBankOperationsOut () { return this.operationsOut.getOperationsOut(); }

    wtedy w wyniku uruchomienia testów dostaję:
    1. test z linii 71 == passed
    2. test z linii 72 == passed
    3. test z linii 73 == "expected: <0> but was: <com.kodilla.bank.homework.CashMachine@16a63f9e>" */

        assertEquals(3,    lloyds.operationsTotal() );  // WRONG!!!!
        assertEquals(3,    lloyds.operationsTotal() );  // WRONG!!!!
        assertEquals(3,    lloyds.operationsTotal() );  // WRONG!!!!
    }
}

//    @Test
//    public void bankBalance() {
//        CashMachine cm1 = new CashMachine();
//        CashMachine cm2 = new CashMachine();
//        CashMachine cm3 = new CashMachine();
//        Bank lloyds = new Bank("Lloyds" , new CashMachine[] {cm1, cm2, cm3});
//
//        assertEquals(0, lloyds.getBankAverage(), 0.0001);
//
//        assertEquals(200.00, lloyds.getBankBalance(),0.0001);  //  WRONG!!!!
//        assertEquals((int) 1, lloyds.getBankOperationsIn(), (int) 0.0001); // tu rzutowałem  arg  na (int)
//        assertEquals((int) 1, lloyds.getBankOperationsOut(), (int) 0.0001); // tu rzutowałem  arg  na (int)
//    }
//
//    private void assertEquals(double v, double bankBalanceAll, double v1) {
////         ten test wygenerowal sie automatycznie - w tym ciele nic nie jest wymagane, jednakże po usunięciu
////         tej metody generuje sie wyjątek -
//    }
//}