package com.ivan.course.state;

import com.ivan.course.entity.Appointment;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class State {
    protected Appointment appointment;

    public abstract void nextState();
    public abstract void info();
    public abstract boolean checkState();
}
