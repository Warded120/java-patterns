package com.cafe.management.OccamRazor.good;

import java.util.ArrayList;
import java.util.List;

class SimpleSchedulingSystem {
    private List<Appointment> appointments;

    public SimpleSchedulingSystem() {
        appointments = new ArrayList<>();
    }

    public void scheduleAppointment(String patientName, String doctorName, String date) {
        Appointment appointment = new Appointment(patientName, doctorName, date);
        appointments.add(appointment);
        System.out.println("Scheduled: " + appointment);
    }
}