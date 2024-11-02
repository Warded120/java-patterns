package com.ivan.course.handler.Impl;

import com.ivan.course.entity.Appointment;
import com.ivan.course.handler.Handler;

public class FastAppointmentHandler extends Handler {
    @Override
    public boolean handle(Appointment appointment) throws InterruptedException{
        System.out.println("Trying to handle fast appointment: " + appointment);
        if(isSuccess()) {
            System.out.println("Successfully handled fast appointment");
            return true;
        }
        return this.handleNext(appointment);
    }
}