package com.ivan.course.handler.Impl;

import com.ivan.course.entity.Appointment;
import com.ivan.course.handler.Handler;

public class DetailedAppointmentHandler extends Handler {
    @Override
    public boolean handle(Appointment appointment) throws InterruptedException {
        System.out.println("Trying to handle as a detailed appointment: " + appointment);
        if (isSuccess()) {
            System.out.println("Appointment handled successfully");
            return true;
        }
        return this.handleNext(appointment);
    }
}
