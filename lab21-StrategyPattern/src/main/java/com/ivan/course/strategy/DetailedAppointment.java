package com.ivan.course.strategy;

import com.ivan.course.Appointment;

public class DetailedAppointment implements IStrategy {
    @Override
    public void handle(Appointment appointment) {
        System.out.println("Appointment: " + appointment + " is detailed");
    }
}
