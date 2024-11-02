package com.ivan.course.mediator;

import com.ivan.course.entity.Doctor;
import com.ivan.course.entity.Patient;

public class Appointment implements Mediator {
    @Override
    public void scheduleAppointment(Patient patient, Doctor doctor) {
        System.out.println("Appointment scheduled for " + patient.getName() + " with Dr. " + doctor.getName());
        notifyDoctor(doctor, "You have a new appointment with " + patient.getName());
        notifyPatient(patient, "Your appointment with Dr. " + doctor.getName() + " has been confirmed.");
    }

    @Override
    public void notifyDoctor(Doctor doctor, String message) {
        doctor.receiveMessage(message);
    }

    @Override
    public void notifyPatient(Patient patient, String message) {
        patient.receiveMessage(message);
    }
}