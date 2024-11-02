package com.ivan.course;

import com.ivan.course.entity.Appointment;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", "Dr. Smith", "today");

        appointment.nextState();
        appointment.setStarted(true);
        appointment.nextState();
        appointment.nextState();
        appointment.setFinished(true);
        appointment.nextState();
        appointment.nextState();
    }
}