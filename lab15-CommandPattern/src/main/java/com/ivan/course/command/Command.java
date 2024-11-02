package com.ivan.course.command;

import com.ivan.course.entity.Appointment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Command {

    @Getter
    protected Appointment appointment;
    protected Appointment backup;

    public Command(Appointment appointment) {
        this.appointment = appointment;
    }

    public void undo() {
        if (backup == null) {
            System.out.println("cannot undo, nothing was executed yet");
            return;
        }
        appointment = new Appointment(backup);
        System.out.println("undo successful: " + appointment);
    }

    protected void backup() {
        backup = new Appointment(appointment);
        System.out.println("backup appointment: " + backup);
    }

    public abstract boolean execute();
}
