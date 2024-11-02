package com.ivan.course.iterator;

import com.ivan.course.entity.Appointment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppointmentSet implements AppointmentCollection {
    Set<Appointment> appointments;

    public AppointmentSet() {
        appointments = new HashSet<Appointment>();
    }

    @Override
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    @Override
    public Iterator<Appointment> createIterator() {
        return appointments.iterator();
    }
}
