package com.cafe.management.SOLID.good;

import java.time.LocalDate;

public class Controller {
    public static void main(String[] args) {
        AppointmentService appointmentService = new AppointmentServiceImpl();

        BaseAppointment appointmentImpl = new AppointmentImpl("Oleg", LocalDate.now());
        appointmentService.handleAppointment((Handleable) appointmentImpl);
        System.out.println("appointment handled: " + appointmentImpl);

        appointmentService.delayAppointment((Delayable) appointmentImpl, LocalDate.now().plusDays(5));
        System.out.println("appointment delayed: " + appointmentImpl);
    }
}
