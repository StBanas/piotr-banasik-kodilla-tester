package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String result;

    public FizzBuzzSteps() {

        Given("number is one houndred and five", () -> {
            this.number = 105;
        });

        Given("number is one", () -> {
            this.number = 1;
        });

        Given("number is fourty", () -> {
            this.number = 40;
        });

        Given("number is five", () -> {
            this.number = 5;
        });

        Given("number is fiveteen", () -> {
            this.number = 15;
        });

        When("I ask if the remainder of division is {int}", (Integer number) -> {
            ConditionChecker conditionChecker = new ConditionChecker();
            this.result = conditionChecker.checkWhatName(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals( string, this.result );
            System.out.println( this.number + "   " + result + "  " + string );
        });
    }
}
