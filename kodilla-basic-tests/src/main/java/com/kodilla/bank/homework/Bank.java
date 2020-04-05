package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] machines;
    private String name;

    public Bank(String name, CashMachine[] machines) {
        this.name = name;
        this.machines = machines;
    }
    public int operationsTotal (){
        int total = 0;
        for (int i=1; i < this.machines.length; i++)
            total += machines[i].getOperations();
            return total;

    }

//    public int getBankBalance() {
//        double balance = CashMachine.getBalance();
//    }
}



