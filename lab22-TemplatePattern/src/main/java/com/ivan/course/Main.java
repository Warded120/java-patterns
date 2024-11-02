package com.ivan.course;

import com.ivan.course.appointment.Appointment;
import com.ivan.course.handler.AppointmentHandler;
import com.ivan.course.handler.DetailedAppointmentHandler;
import com.ivan.course.handler.FastAppointmentHandler;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", "Dr. Smith", "today");

        System.out.println("fast ----------------------------");
        AppointmentHandler fastHandler = new FastAppointmentHandler(appointment);
        fastHandler.handle();

        System.out.println("detailed ------------------------");
        AppointmentHandler detailedHandler = new DetailedAppointmentHandler(appointment);
        detailedHandler.handle();
    }
}