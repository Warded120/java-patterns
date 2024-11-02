package com.ivan.course.command.impl;

import com.ivan.course.command.Command;
import com.ivan.course.entity.Appointment;

public class HandleAppointment extends Command {
    public HandleAppointment(Appointment appointment, Appointment previous) {
        super(appointment, previous);
    }

    public HandleAppointment(Appointment appointment) {
        super(appointment);
    }

    @Override
    public boolean execute() {
        if(appointment.isHandled()) {
            System.out.println("Appointment is already handled");
            return false;
        }
        appointment.setHandled(true);
        System.out.println("Appointment handled: " + appointment);
        return true;
    }
}
