package com.ivan.course;

import com.ivan.course.observer.Doctor;
import com.ivan.course.observer.Patient;
import com.ivan.course.subject.Appointment;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Oleg");
        Doctor doctor = new Doctor("Dr. Smith");

        Appointment appointment = new Appointment("today");

        appointment.registerObserver(patient);
        appointment.registerObserver(doctor);

        appointment.notifyObservers();
    }
}