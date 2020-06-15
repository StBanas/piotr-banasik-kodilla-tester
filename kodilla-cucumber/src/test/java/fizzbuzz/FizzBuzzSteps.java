package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String name;

    public FizzBuzzSteps() {
        Given ("the {int} is positive Integer", (Integer int1) -> {
           this.number=105;
        });

        When("I ask what is the result of division of {int} by any value", (Integer int1) -> {
            ConditionChecker conditionChecker = new ConditionChecker();
            this.name = conditionChecker.checkIfZero(int1);
        });

        Then("I should be told name", () -> {

            Assert.assertEquals(name, this.name);
        });

    }

}
