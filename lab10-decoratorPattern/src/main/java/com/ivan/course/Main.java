package com.ivan.course;

import com.ivan.course.component.Appointment;
import com.ivan.course.decorator.concreteDecorator.DelayableAppointmentDecorator;
import com.ivan.course.decorator.concreteDecorator.EmergencyAppointmentDecorator;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Appointment appointment1 = new Appointment("Oleg", LocalDateTime.of(2024, 9, 23, 14, 0), List.of("blood test", "pressure test"));
        Appointment appointment2 = new Appointment("Petya", LocalDateTime.of(2024, 9, 23, 14, 0), List.of("blood test", "pressure test"));

        System.out.println("\nwork with delaying appointment ------------------------------------------");
        DelayableAppointmentDecorator delayableAppointment = new DelayableAppointmentDecorator(appointment1);

        delayableAppointment.delayAppointmentHours(4);

        System.out.println("date: " + delayableAppointment.getAppointmentDateTime());

        System.out.println(delayableAppointment.holdAppointment());
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("\nwork with emergency appointment ------------------------------------------");
        EmergencyAppointmentDecorator emergencyAppointment = new EmergencyAppointmentDecorator(appointment2);
        emergencyAppointment.setUpEmergencyAppointment();
        System.out.println(emergencyAppointment.holdAppointment());
        System.out.println("--------------------------------------------------------------------------");
    }
}