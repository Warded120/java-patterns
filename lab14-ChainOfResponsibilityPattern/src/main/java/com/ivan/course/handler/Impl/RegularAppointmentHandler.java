package com.ivan.course.handler.Impl;

import com.ivan.course.entity.Appointment;
import com.ivan.course.handler.Handler;

public class RegularAppointmentHandler extends Handler {
    @Override
    public boolean handle(Appointment appointment) throws InterruptedException {
        System.out.println("Trying to handle regular appointment: " + appointment);
        if(isSuccess()) {
            System.out.println("Successfully handled regular appointment");
            return true;
        }
        return this.handleNext(appointment);
    }
}
