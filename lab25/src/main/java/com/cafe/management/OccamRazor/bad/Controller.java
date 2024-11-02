package com.cafe.management.OccamRazor.bad;

import java.util.HashMap;
import java.util.Map;

class Controller {
    private Map<String, Doctor> doctors;

    public Controller() {
        doctors = new HashMap<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getName(), doctor);
    }

    public void scheduleAppointment(String patientName, String doctorName, String date) {
        // Complex logic to find a doctor and schedule an appointment
        if (!doctors.containsKey(doctorName)) {
            throw new IllegalArgumentException("Doctor not found!");
        }
        Doctor doctor = doctors.get(doctorName);
        Appointment appointment = new Appointment(patientName, doctorName, date);
        doctor.addAppointment(appointment);
    }
}