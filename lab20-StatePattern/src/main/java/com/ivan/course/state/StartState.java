package com.ivan.course.state;

import com.ivan.course.entity.Appointment;

public class StartState extends State {
    public StartState(Appointment appointment) {
        super(appointment);
        info();
    }

    @Override
    public void nextState() {
        if(checkState()) {
            appointment.setState(new FinishedState(appointment));
        } else {
            System.out.println("Appointment not finished. Remain in start state");
        }
    }

    @Override
    public void info() {
        System.out.println("Appointment started");
    }

    @Override
    public boolean checkState() {
        return appointment.isFinished();
    }
}
