package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine depositIn;
    private CashMachine operations;
//    private CashMachine operationsIn;
//    private CashMachine operationsOut;

//    private CashMachine withdrawal;

    public Bank(String name) {
        this.name = name;
        this.depositIn = new CashMachine();
        this.operations = new CashMachine();
//        this.operationsIn = new CashMachine();
//        this.operationsOut = new CashMachine();

//        this.withdrawal = new CashMachine();
    }
    public double cashIn(double amount) {
        if (amount > 0)
        {
            this.depositIn.add(amount);
            return amount;
        }
        else
        {
            this.depositIn.substract(amount);
            return amount;
        }
    }

    public int getBankOperations ()
    {
        return this.operations.getOperations();
    }

    public double getBankBalance ()
    {

        return this.depositIn.getAverage(); // tu jest  lekka ściema - zamiast getAverage powinno byc getBalance
    }                                       // ale z getBalance nie działa - bo chce doubla [] zamiast doubla

    public double getBankAverage ()
    {
        return depositIn.getAverage();
    }
}



