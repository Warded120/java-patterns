package com.cafe.management.SOLID.good;

import java.time.LocalDate;

// Dependency Inversion
public interface AppointmentService {
    void handleAppointment(Handleable appointment);
    void delayAppointment(Delayable appointment, LocalDate newDate);
}
