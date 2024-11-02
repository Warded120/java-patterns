package com.ivan.course.adaptee;

import com.ivan.course.adaptee.misc.CurrencyType;
import com.ivan.course.adaptee.misc.Transaction;

public class LegacyBankClient {

    Transaction transaction;

    public void createTransaction(float amount, CurrencyType currencyType, String destination) {
        transaction = new Transaction(amount, currencyType, destination);
        System.out.println("Transaction created: " + transaction);
    }

    public void performTransaction() {
        try {
            transaction.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
