package com.ivan.course.entity.appointment;

import com.ivan.course.entity.person.Doctor;
import com.ivan.course.entity.person.Patient;
import com.ivan.course.pureFabrication.Logger;
import com.ivan.course.pureFabrication.Rand;

import java.time.LocalDate;

public class DetailedAppointment extends Appointment {

    public DetailedAppointment(Patient patient, Doctor doctor, LocalDate appointmentDate) {
        super(patient, doctor, appointmentDate);
    }

    @Override
    public boolean handle() {
        double probability = (double) doctor.getExperience()/100 + .6 + ((36.6 - patient.getTemperature()) / 10);
        Logger.log("success probability: " + probability);
        return Rand.random(probability);
    }
}
