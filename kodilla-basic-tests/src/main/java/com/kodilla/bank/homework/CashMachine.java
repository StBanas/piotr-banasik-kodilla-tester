package com.kodilla.bank.homework;

public class CashMachine
    {
    private double[] balance;
    private int operationsIn;
    private int operationsOut;
    private int operations;

        public CashMachine()
        {
            this.operations = 0;
            this.operationsIn = 0;
            this.operationsOut = 0;
            this.balance = new double[0];
        }

    public void add(double amount) {
        this.operations++;
        if (amount > 0 ){ this.operationsIn++; }
        else { this.operationsOut++; }
        double[] newTab = new double[this.operations];
        System.arraycopy(balance, 0, newTab, 0, balance.length);
        newTab[this.operations - 1] = amount;
        this.balance = newTab;
    }
    public void substract(double amount) {
        this.operations++;
        double[] newTab = new double[this.operations];
        System.arraycopy(balance, 0, newTab, 0, balance.length);
        newTab[this.operations - 1] = amount;
        this.balance = newTab;
    }
        public double[] getBalance()
        {
            double balance = 0;
            for(int i = 0; i < this.balance.length; i++) {
                balance += this.balance[i];
            }
            return this.balance; /*  moim zdaniem tu powinno być jednak samo "balance ???
                                    i co to są te podkreslniki "underline" pod total i balance??*/
        }

    public double getAverage()
    {
        if (this.balance.length == 0) {
            return 0;
        }
        double total = 0;
        for(int i = 0; i < this.balance.length; i++) {
            total += this.balance[i];
        }
        return total/this.balance.length;
    }
    public int getOperationsIn() {return operationsIn; }
    public int getOperationsOut()
    {
        return operationsOut;
    }
    public int getOperations()
    {
        return operations;
    }

}

