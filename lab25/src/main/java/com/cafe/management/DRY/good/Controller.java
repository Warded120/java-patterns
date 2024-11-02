package com.cafe.management.DRY.good;

import java.time.LocalDate;

public class Controller {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", LocalDate.now().plusDays(2));
        if(AppointmentValidator.validateAppointment(appointment)) {
            System.out.println("Appointment is valid");
        } else {
            System.out.println("Appointment is not valid");
        }
    }
}
