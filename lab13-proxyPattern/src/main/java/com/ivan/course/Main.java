package com.ivan.course;

import com.ivan.course.object.Appointment;
import com.ivan.course.proxy.AppointmentProxy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new AppointmentProxy("Oleg");
        row();
        appointment.schedule(LocalDate.now());
        row();
        appointment.start();
        row();
        System.out.println();
        Appointment canceledAppointment = new AppointmentProxy("Petya");
        row();
        canceledAppointment.schedule(LocalDate.now());
        row();
        canceledAppointment.cancel();
        row();
    }

    private static void row() {
        System.out.println("-------------------------------------------------");
    }
}