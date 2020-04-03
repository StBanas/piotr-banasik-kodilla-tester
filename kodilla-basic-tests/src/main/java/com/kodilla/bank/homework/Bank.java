package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] machines;
    private String name;
    private CashMachine operations;
    private CashMachine operationsIn;
    private CashMachine operationsOut;
    private CashMachine transaction;

    public Bank(String name, CashMachine[] machines) {
        this.name = name;
        this.machines = machines;
        this.operations = new CashMachine();
        this.operationsIn = new CashMachine();
        this.operationsOut = new CashMachine();
        this.transaction = new CashMachine();
    }

    public CashMachine getBankOperations ()
    {
        return this.operations;
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
        return this.transaction.getBalance();
    }

    public double getBankAverage()
    {
        return this.operations.getAverage();
    }


}



