package com.ivan.course.iterator;

import com.ivan.course.entity.Appointment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppointmentList implements AppointmentCollection {
    private List<Appointment> appointments;

    public AppointmentList() {
        appointments = new ArrayList<>();
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

