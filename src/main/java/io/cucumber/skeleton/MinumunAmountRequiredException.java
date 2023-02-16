package io.cucumber.skeleton;

public class MinumunAmountRequiredException extends Exception {
    public MinumunAmountRequiredException(Integer minimumAmount) {
        super("minimun amout is 1 euros");
    }
}
