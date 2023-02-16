package io.cucumber.skeleton;

public class Account {

    private Integer balance;
    private final Integer MINIMUM_AMOUNT = 1;

    public Account(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount) throws MinumunAmountRequiredException {
        if(amount < MINIMUM_AMOUNT) {
            throw new MinumunAmountRequiredException(MINIMUM_AMOUNT);
        }
        balance += amount;
    }


    public Integer getBalance() {
        return balance;
    }
}
