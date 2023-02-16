package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StepDefinitions {
    private Account account;
    private Exception exception;

    @Given("an account with {int} euros")
    public void an_account_with_euros(Integer balance) {
        account = new Account(balance);
    }
    @When("I deposit {int} euros")
    public void i_deposit_euros(Integer amount) throws MinumunAmountRequiredException {
        try {
            account.deposit(amount);
        }catch (Exception exception){
            this.exception = exception;
        }

    }
    @Then("account balance is {int} euros")
    public void account_balance_is_euros(Integer balance) {
        assertEquals(balance, account.getBalance());
    }

    @Then("a error message minimun amout is {int} euros")
    public void a_error_message_minimun_amout_is_euros(Integer minimumAmount) {
        assertEquals("minimun amout is 1 euros", exception.getMessage());
    }

}
