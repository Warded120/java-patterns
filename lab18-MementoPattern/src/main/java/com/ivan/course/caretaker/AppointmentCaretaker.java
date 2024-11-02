package com.ivan.course.caretaker;

import com.ivan.course.memento.AppointmentMemento;
import com.ivan.course.originator.Appointment;

public class AppointmentCaretaker {
    private AppointmentMemento memento;

    public void saveState(Appointment appointment) {
        memento = appointment.save();
        System.out.println("Saved appointment: " + appointment);
    }

    public void restoreState(Appointment appointment) {
        appointment.restore(memento);
        System.out.println("Restored appointment: " + appointment);
    }
}
