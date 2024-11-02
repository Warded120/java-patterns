package com.ivan.course.originator;

import com.ivan.course.memento.AppointmentMemento;

public interface Originator {
    AppointmentMemento save();
    void restore(AppointmentMemento memento);
}
