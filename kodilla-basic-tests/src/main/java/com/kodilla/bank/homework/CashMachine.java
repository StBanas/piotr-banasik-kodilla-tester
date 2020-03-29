package com.kodilla.bank.homework;

public class CashMachine
    {
    private double[] transaction;
    private double balance;
    private int operationsIn;
    private int operationsOut;
    private int operations;
        public CashMachine()
        {
            this.operations = 0;
            this.operationsIn = 0;
            this.operationsOut = 0;
            this.balance = 0;
            this.transaction = new double[0];
        }
    public void add(double amount) {
        this.operations++;
        if (amount > 0 ){ this.operationsIn++; }
        else { this.operationsOut++; }
        double [] newTab = new double[this.operations];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[this.operations - 1] = amount;
        this.transaction = newTab;
    }
    public void substract(double amount) {
        this.operations++;
        double[] newTab = new double[this.operations];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[this.operations - 1] = amount;
        this.transaction= newTab;
    }
    public double getAverage()
    {
        if (this.transaction.length == 0) {
            return 0;
        }
        double total = 0;
        for(int i = 0; i < this.transaction.length; i++) {
            total += this.transaction[i];
        }
        return total/this.transaction.length;
    }
    public double getBalance(){
        double saldo = 0;
        for(int i = 0; i < this.transaction.length; i++)
            saldo += this.transaction[i];
        return  saldo;
    }

    public int getTransactionLength(){
            return transaction.length;
    }

    public double getCashIn ()
    {
         double saldoCashIn = 0;
         for(int i = 0; i < this.transaction.length; i++) {
             if (this.transaction[i] >= 0) {
                 saldoCashIn += this.transaction[i];
             }
         }
             return saldoCashIn;
    }
        public double getCashOut ()
        {
            return getBalance() - getCashIn();
        }


        public int getOperationsIn()
    {
        return operationsIn;
    }

    public int getOperationsOut()
    {
        return operationsOut;
    }

    public int getOperations()
    {
        return operations;
    }

}

