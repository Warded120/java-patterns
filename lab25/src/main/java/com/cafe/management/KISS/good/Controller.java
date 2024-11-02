package com.cafe.management.KISS.good;

import java.time.LocalDate;

public class Controller {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", LocalDate.now());
        System.out.println(appointment);
    }
}
