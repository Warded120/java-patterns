package com.ivan.course.command.impl;

import com.ivan.course.command.Command;
import com.ivan.course.entity.Appointment;

import java.time.LocalDate;

public class DelayAppointment extends Command {
    public DelayAppointment(Appointment appointment, Appointment previous) {
        super(appointment, previous);
    }

    public DelayAppointment(Appointment appointment) {
        super(appointment);
    }

    @Override
    public boolean execute() {
        appointment.setAppointmentTime(appointment.getAppointmentTime().plusDays(1));
        System.out.println("Appointment delayed by 1 day: " + appointment);
        return true;
    }
}
