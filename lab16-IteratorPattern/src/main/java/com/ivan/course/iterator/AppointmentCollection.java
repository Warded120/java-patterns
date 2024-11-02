package com.ivan.course.iterator;

import com.ivan.course.entity.Appointment;

import java.util.Iterator;

interface AppointmentCollection {
    void addAppointment(Appointment appointment);
    void removeAppointment(Appointment appointment);
    Iterator<Appointment> createIterator();
}