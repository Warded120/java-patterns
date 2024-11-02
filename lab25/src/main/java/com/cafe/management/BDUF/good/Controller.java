package com.cafe.management.BDUF.good;

public class Controller {
    public static void main(String[] args) {
        Appointment appointment = new DetailedAppointment();
        Service.handle(appointment);

        appointment = new FastAppointment();
        Service.handle(appointment);
    }
}
