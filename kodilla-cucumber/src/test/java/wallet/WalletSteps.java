package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            Wallet wallet = new Wallet();
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

        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });
        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });

        When("I request $300", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 300);
        });
        Then("$300 should be dispensed", () -> {
            Assert.assertEquals(300, cashSlot.getContents());
        });

        When("I request $0", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });
    }
}
