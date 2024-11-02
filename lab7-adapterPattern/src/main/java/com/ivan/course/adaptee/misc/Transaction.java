package com.ivan.course.adaptee.misc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    private static Random rand = new Random();

    private final float amount;
    private final CurrencyType currencyType;
    private final String destination;

    public void execute() throws InterruptedException {
        System.out.println("Executing transaction...");

        Thread.sleep(500);
        if (rand.nextInt(100) > 50) { // 50% chance of success;
            transactionSuccess();
        } else {
            transactionFailure();
        }

    }

    private void transactionSuccess() {
        System.out.println("Transaction of " + amount + " " + currencyType.name() + " is successfully sent to: " + destination);
    }

    private void transactionFailure() {
        System.out.println("Transaction of " + amount + " " + currencyType.name() + " is failed");
    }
}