package com.kodilla.bank.homework;
import java.util.Arrays;
public class Main {

        private CashMachine[] machines;
        private String name;

        public Main(String name, CashMachine[] machines) {
            this.name = name;
            this.machines = machines;
        }

        public static class CashMachine {
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

            public void add(double amount){
                this.operations++;

                if (amount > 0) {
                    this.operationsIn++; }
                else {
                    this.operationsOut++;
                }

                double[] newTab = new double[this.operations];
                System.arraycopy(transaction, 0, newTab, 0, transaction.length);
                newTab[this.operations - 1] = amount;

                this.transaction = newTab;
            }

            public int getOperations() {
                return this.operations;

            }
            public double[] getTransaction() {
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

            CashMachine m1 = new CashMachine("machine1");
            CashMachine m2 = new CashMachine("machine2");
            CashMachine m3 = new CashMachine("machine3");

            Main ingBank = new Main("ING", new CashMachine[]{m1,m2,m3});

            m1.add(500.0);
            m1.add(700.0);
            m1.add(-450);


            double balance = m1.getBalance();
//            double transaction = m1.getTransaction();
            double operation = m1.getOperations();
            double op = m1.getBalance();
            double[] opout = m1.getTransaction();


            System.out.println(operation);
            System.out.println(op);
            System.out.println(Arrays.toString(opout));
            System.out.println(balance);


        }

}
