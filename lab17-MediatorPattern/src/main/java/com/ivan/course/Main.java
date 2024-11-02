package com.ivan.course;

import com.ivan.course.entity.Doctor;
import com.ivan.course.entity.Patient;
import com.ivan.course.mediator.Appointment;
import com.ivan.course.mediator.Mediator;

// Main class to demonstrate the Mediator pattern
public class Main {
    public static void main(String[] args) {
        Mediator appointmentMediator = new Appointment();

        Patient patient = new Patient("John Doe", appointmentMediator);
        Doctor doctor = new Doctor("Smith", appointmentMediator);

        // Patient schedules an appointment with the doctor
        patient.scheduleAppointment(doctor);
    }
}
