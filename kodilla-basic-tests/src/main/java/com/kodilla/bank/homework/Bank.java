package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine depositIn;
    private CashMachine operations;
    private CashMachine operationsIn;
    private CashMachine operationsOut;

    public Bank(String name) {
        this.name = name;
        this.depositIn = new CashMachine();
        this.operations = new CashMachine();
        this.operationsIn = new CashMachine();
        this.operationsOut = new CashMachine();
    }

    public double cashIn(double amount)
        {
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

    public int getBankOperationsIn ()
    {
        return this.operationsIn.getOperationsIn();
    }

    public int getBankOperationsOut ()
    {
        return this.operationsOut.getOperationsOut();
    }

    public double getBankBalance ()
    {
        return this.depositIn.getBalance();
    }

    public double getBankAverage()
    {
        return this.depositIn.getAverage();
    }
}



