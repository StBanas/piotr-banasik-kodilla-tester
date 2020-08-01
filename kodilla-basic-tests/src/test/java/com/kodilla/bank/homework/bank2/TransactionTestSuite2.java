package com.kodilla.bank.homework.bank2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTestSuite2 {
    @Test
    public void IsOperationCorrectwhenPositiveAmount(){
        Transaction operation = new Transaction();
        operation.addTransaction(200);
        assertEquals(operation.getSaldo(), 200);
    }
    @Test
    public void IsOperationCorrectwhenNegativeAmount(){
        Transaction operation = new Transaction();
        operation.addTransaction(-200);
        assertEquals(operation.getSaldo(), -200);
    }
    @Test
    public void IsOperationCorrectWhenZeroAmount(){
        Transaction operation = new Transaction();
        operation.addTransaction(0);
        operation.addTransaction(0);
//        operation.addTransaction(-120);
        assertEquals(operation.getSaldo(), 0);
    }
    @Test
    public void IsOperationCorrectWhenPositiveAndNegativeAmount(){
        Transaction operation = new Transaction();
        operation.addTransaction(200);
        operation.addTransaction(-2000);
        assertEquals(operation.getSaldo(), -1800);
    }
    @Test
    public void IsNumberOfOperationCorrectWhenPositiveAndNegativeAmount(){
        Transaction operation = new Transaction();
        operation.addTransaction(200);
        operation.addTransaction(-2000);
        assertEquals(operation.getSaldo(), -1800);
    }

}
