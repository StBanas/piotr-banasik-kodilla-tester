package com.kodilla.bank.homework;

import java.util.Arrays;

public class Main {
    private CashMachine[] machines;
    private String name;

    public Main(String name) {
        this.name = name;
        this.machines = new CashMachine[0];
    }

    public class CashMachine {
        private String name;
        private double[] transaction;
        private int operations;
        private int operationsIn;
        private int operationsOut;

        public CashMachine(String name) {
            this.name = name;
            this.operations = 0;
            this.operationsIn = 0;
            this.operationsOut = 0;
            this.transaction = new double[0];
        }

        public double[] add(double amount){
            this.operations++;
            if (amount > 0) { this.operationsIn++; }
            else { this.operationsOut++; }
            double[] newTab = new double[this.operations];
            System.arraycopy(transaction, 0, newTab, 0, transaction.length);
            newTab[this.operations - 1] = amount;
            this.transaction = newTab;
            return newTab;
        }
        public int getOperations() {
            return this.operations;

        }public double[] getTransaction() {
            return this.transaction;
        }

        public double getBalance() {
            double saldo = 0;
            for (int i = 0; i < this.transaction.length; i++)
                saldo += transaction[i];
            return saldo;
        }
    }
    public static void main(String[] args) {
        Main[] bank = new Main[2];
        bank[0] = new Main("B1");
        bank[0].machines = new CashMachine[4];
        bank[0].new CashMachine("CM1");
        CashMachine[] machine = new CashMachine[3];
        double[] trs3 = machine[0].add(2000);
    }
}

//       double trs1 = bank[0].new CashMachine("CM1").add(100);
//        double trs2 = bank[0].new CashMachine("CM1").add(200);


//        System.out.println(trs3 + "     " + trs3);
//        System.out.println(Arrays.toString(bank[0].new CashMachine("CM1").getTransaction()));
//        System.out.println(bank[0].new CashMachine("CM1").getOperations());

