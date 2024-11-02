package com.cafe.management.OccamRazor.bad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
class Doctor {
    private String name;
    private List<Appointment> appointments;

    public Doctor(String name) {
        this.name = name;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}