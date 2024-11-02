package com.ivan.course.adapter;

import com.ivan.course.adaptee.LegacyBankClient;
import com.ivan.course.adaptee.misc.CurrencyType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankClientAdapter implements TransactionProccessor {

    LegacyBankClient bankClient;

    @Override
    public void proccess(float amount, CurrencyType currencyType, String destination) {
        bankClient.createTransaction(amount, currencyType, destination);
        bankClient.performTransaction();
    }
}
