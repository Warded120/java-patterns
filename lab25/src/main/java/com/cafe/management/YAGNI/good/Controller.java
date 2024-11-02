package com.cafe.management.YAGNI.good;

public class Controller {
    private static Service service;

    public static void main(String[] args) {
        service = new Service();

        service.requiredMethod();
    }
}
