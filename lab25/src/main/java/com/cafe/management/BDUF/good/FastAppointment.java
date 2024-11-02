package com.cafe.management.BDUF.good;

public class FastAppointment implements Appointment {
    @Override
    public void handle() {
        System.out.println("Fast Appointment is handled");
    }
}
