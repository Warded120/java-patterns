package com.cafe.management.BDUF.good;

public class DetailedAppointment implements Appointment {
    @Override
    public void handle() {
        System.out.println("Detailed appointment is handled");
    }
}
