package com.cafe.management.DRY.bad;

import java.time.LocalDate;

public class Controller {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", LocalDate.now().minusDays(2));
        if(AppointmentValidator.validateAppointment(appointment) &&
                AppointmentValidator.validateAppointmentDate(appointment)) {
            System.out.println("Appointment is valid");
        } else {
            System.out.println("Appointment is not valid");
        }
    }
}
