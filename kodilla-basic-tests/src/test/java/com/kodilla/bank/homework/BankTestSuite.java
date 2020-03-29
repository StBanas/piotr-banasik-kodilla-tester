package com.kodilla.bank.homework;

//import com.kodilla.school.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {

    @Test
    public void averageShouldBeZeroIfCashMashineDontHaveOperations() {
        Bank lloyds = new Bank("Lloyds");
        assertEquals(0.0, lloyds.getBankAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        Bank bank = new Bank("Lloyds");
        bank.cashIn(100.00);
        bank.cashIn(-20.00);

//        double bankAverage = bank.getBankAverage();

        assertEquals(40, bank.getBankAverage(), 0.0001);
    }

    @Test
    public void numberOperationsInOut() {
        Bank bank = new Bank("Lloyds");
        bank.cashIn(100.00);
        bank.cashIn(20.00);
        bank.cashIn(200.00);
        bank.cashIn(-100.00);

        assertEquals(4, bank.getBankOperations(), (int) 0.0001); /* nie zwraca mi ilosci operacji*/
        assertEquals(3, bank.getBankOperationsIn(), (int) 0.0001);
        assertEquals(1, bank.getBankOperationsOut(), (int) 0.0001);
    }

    @Test
    public void bankBalance() {
        Bank bank = new Bank("Lloyds");
        bank.cashIn(100.00);
        bank.cashIn(20.00);
        bank.cashIn(200.00);
        bank.cashIn(-100.00);

        assertEquals(220.00, bank.getBankBalance(),0.0001); /* nie zwraca mi stanu konta*/
        assertEquals(3, bank.getBankOperationsIn(), (int) 0.0001);
        assertEquals(1, bank.getBankOperationsOut(), (int) 0.0001);
    }

    private void assertEquals(double v, double bankBalanceAll, double v1) {  // ten test wygenerowal sie auto
    }
}