package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
//            Wallet wallet = new Wallet();
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200,wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
           Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100,wallet.getBalance());
        });

        When("I check my balance", () -> {
           Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100,wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            cashSlot.dispense(0);
        });

        Then("I should be told that I have insufficient funds in my account", () -> {

            System.out.println("Sorry. Incorrect amount or too litle money on account");
        });

    }
}


