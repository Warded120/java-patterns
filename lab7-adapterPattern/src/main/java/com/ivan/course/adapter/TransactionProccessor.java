package com.ivan.course.adapter;

import com.ivan.course.adaptee.misc.CurrencyType;

public interface TransactionProccessor {
    void proccess(float amount, CurrencyType currencyType, String destination);
}
