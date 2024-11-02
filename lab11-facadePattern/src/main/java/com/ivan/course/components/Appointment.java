package com.ivan.course.components;

import java.time.LocalDate;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;

    public Appointment(Patient patient, Doctor doctor, LocalDate date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void set() {
        System.out.println("the appointment is set to " + date);
    }

    public void start() {
        System.out.println("the appointment is started");
    }
}
