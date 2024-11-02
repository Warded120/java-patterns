package com.ivan.course;

import com.ivan.course.strategy.IStrategy;

public class AppointmentHandler {
    private final Appointment appointment;
    private IStrategy strategy;

    public AppointmentHandler(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void handle() {
        strategy.handle(appointment);
    }
}
