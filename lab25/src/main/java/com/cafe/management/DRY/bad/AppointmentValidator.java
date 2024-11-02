package com.cafe.management.DRY.bad;

import java.time.LocalDate;

public class AppointmentValidator {
    public static boolean validateAppointment(Appointment appointment) {
        if(appointment == null) {
            return false;
        }
        if(appointment.getPatientName().isBlank()) {
            return false;
        }
        if (appointment.getDate().isBefore(LocalDate.now())) {
            return false;
        }

        return true;
    }

    // Do Repeat Yourself
    public static boolean validateAppointmentDate(Appointment appointment) {
        if (appointment.getDate().isBefore(LocalDate.now())) {
            return false;
        }
        return true;
    }
}
