package com.ivan.course.service;

import com.ivan.course.entity.appointment.Appointment;
import com.ivan.course.entity.appointment.DetailedAppointment;
import com.ivan.course.entity.appointment.FastAppointment;
import com.ivan.course.entity.person.Doctor;
import com.ivan.course.entity.person.Patient;
import com.ivan.course.factory.DoctorFactory;
import com.ivan.course.factory.PatientFactory;
import com.ivan.course.pureFabrication.Logger;

import java.time.LocalDate;

// Indirection
public class AppointmentService {

    // Creator
    PatientFactory patientFactory;
    DoctorFactory doctorFactory;

    public AppointmentService() {
        patientFactory = new PatientFactory();
        doctorFactory = new DoctorFactory();
    }

    public Patient createPatient(String name, int age, double temperature) {
        return patientFactory.create(name, age, temperature);
    }

    public Doctor createDoctor(String name, int age, int experience) {
        return doctorFactory.create(name, age, experience);
    }

    public void handleAppointment(Appointment appointment) {
        Logger.log("Handling appointment: " + appointment);

        // simulate calculation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(appointment.handle()) {
            Logger.log("Appointment is successfully handled");
        } else {
            Logger.log("Appointment failed");
        }
    }
}
