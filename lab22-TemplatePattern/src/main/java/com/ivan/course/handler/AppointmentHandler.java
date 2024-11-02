package com.ivan.course.handler;

import com.ivan.course.appointment.Appointment;

public abstract class AppointmentHandler {
    protected Appointment appointment;

    public AppointmentHandler(Appointment appointment) {
        this.appointment = appointment;
    }

    public void handle() {
        schedule();
        notifyMembers();
        startAppointment();
        getResults();
    }

    protected abstract void schedule();
    protected abstract void notifyMembers();
    protected abstract void startAppointment();
    protected abstract void getResults();
}
