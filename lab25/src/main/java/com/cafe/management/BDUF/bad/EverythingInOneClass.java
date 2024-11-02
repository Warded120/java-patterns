package com.cafe.management.BDUF.bad;

// Service and controller in one class
public class EverythingInOneClass {
    public static void handleFastAppointment(FastAppointment appointment) {
        appointment.handleFast();
    }

    public static void handleDetailedAppointment(DetailedAppointment appointment) {
        appointment.handleDetailed();
    }

    public static void main(String[] args) {
        FastAppointment appointment1 = new FastAppointment();
        handleFastAppointment(appointment1);

        DetailedAppointment appointment2 = new DetailedAppointment();
        handleDetailedAppointment(appointment2);
    }
}
