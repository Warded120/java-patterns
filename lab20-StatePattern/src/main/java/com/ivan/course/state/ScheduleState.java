package com.ivan.course.state;

import com.ivan.course.entity.Appointment;

public class ScheduleState extends State {
    public ScheduleState(Appointment appointment) {
        super(appointment);
        info();
    }

    @Override
    public void nextState() {
        if(checkState()) {
            appointment.setState(new StartState(appointment));
        } else {
            System.out.println("Appointment not started. Remain in schedule state");
        }
    }

    @Override
    public void info() {
        System.out.println("in schedule state");
    }

    @Override
    public boolean checkState() {
        return appointment.isStarted();
    }
}
