package com.ivan.course.state;

import com.ivan.course.entity.Appointment;

public class FinishedState extends State {
    public FinishedState(Appointment appointment) {
        super(appointment);
        info();
    }

    @Override
    public void nextState() {
        System.out.println("Appointment has finished. no next state");
    }

    @Override
    public void info() {
        System.out.println("Appointment has finished");
    }

    @Override
    public boolean checkState() {
        return true;
    }
}
