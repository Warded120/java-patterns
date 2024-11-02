package com.cafe.management.SOLID.good;

import java.time.LocalDate;

// Single Responsibility
public class AppointmentServiceImpl implements AppointmentService{
    public void handleAppointment(Handleable appointment) {
        appointment.handle();
    }
    public void delayAppointment(Delayable appointment, LocalDate newDate) {
        appointment.delay(newDate);
    }
}
