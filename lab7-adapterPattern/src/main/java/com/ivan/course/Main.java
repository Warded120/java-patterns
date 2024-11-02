package com.ivan.course;

import com.ivan.course.adaptee.LegacyBankClient;
import com.ivan.course.adaptee.misc.CurrencyType;
import com.ivan.course.adapter.BankClientAdapter;

// Проектування інтернет-кабінету клієнта банку
public class Main {
    public static void main(String[] args) {
        LegacyBankClient legacyBankClient = new LegacyBankClient();

        BankClientAdapter adapter = new BankClientAdapter(legacyBankClient);

        adapter.proccess(100, CurrencyType.USD, "David");
    }
}