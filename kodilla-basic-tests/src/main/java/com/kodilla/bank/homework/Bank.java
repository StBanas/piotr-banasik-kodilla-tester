package com.kodilla.bank.homework;

import java.lang.reflect.Array;

public class Bank {


    private CashMachine[] machines;
    private String name;

    public Bank(String name, CashMachine[] machines)
        {
            this.name = name;
            this.machines = machines;
        }

    public double operationsTotal()
        {
        double total = 0;

        for (int i=0; i < this.machines.length; i++)
        {
            total += machines[i].getOperations();
        }
            return total;
        }
    public double getBankBalance()
        {
        double balance = 0;

        for (int i =0; i < this.machines.length; i++)
            balance += machines[i].getBalance();
        {
            return balance;
        }
    }
}



