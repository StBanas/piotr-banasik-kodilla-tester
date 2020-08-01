package com.kodilla.bank.homework.bank2;

public class Transaction {
    private int cashIn;
    private int cashOut;
    private int countCashIn;
    private int countCashOut;

    public Transaction() {
        this.cashIn = cashIn;
        this.cashIn = cashOut;
        this.countCashIn = countCashIn;
        this.countCashOut = countCashOut;
    }

    public void addTransaction(double amount) {
        if (amount >= 0) {
            this.cashIn += amount;
            this.countCashIn++;
//            return this.cashIn;
        }
        else {
            this.cashOut += amount;
            this.countCashOut++;
//            return this.cashIn;
        }
    }
    public double getIn() { return this.cashIn; }
    public double getOut() { return this.cashOut; }

    public double getCountIn() { return this.countCashIn; }
    public double getCountOut() { return this.countCashOut; }

    public double getSaldo() { return (getIn() + getOut()); }
    public double getNumberOpetarions() { return (getCountIn() + getCountOut()); }
}
