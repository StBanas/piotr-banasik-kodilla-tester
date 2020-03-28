package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine depositIn;
    private CashMachine operations;
    private CashMachine operationsIn;
    private CashMachine operationsOut;

//    private CashMachine withdrawal;

    public Bank(String name) {
        this.name = name;
        this.depositIn = new CashMachine();
        this.operations = new CashMachine();
        this.operationsIn = new CashMachine();
        this.operationsOut = new CashMachine();

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

        public int getBankOperationsIn ()
        {
            return this.operationsIn.getOperationsIn();
        }

        public int getBankOperationsOut ()
        {
            return this.operationsOut.getOperationsOut();
        }

        public int getBankOperations ()
        {
            return this.operations.getOperations();
        }

        public CashMachine getBalans ()
        {
            return depositIn;
        }

        public double getBankAverage ()
        {
            return this.depositIn.getAverage();
        }
}



