package com.ivan.course.strategy;

import com.ivan.course.Appointment;

public class FastAppointment implements IStrategy {

    @Override
    public void handle(Appointment appointment) {
        System.out.println("Appointment: " + appointment + " is fast");
    }
}
