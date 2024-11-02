package com.ivan.course.facade;

import com.ivan.course.components.Appointment;
import com.ivan.course.components.Doctor;
import com.ivan.course.components.Patient;
import com.ivan.course.components.enums.Symptom;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class AppointmentFacade {
    private final Patient patient;
    private Doctor doctor;

    public void setupAppointment() {
        System.out.println("setting up appointment");
        Symptom symptom = patient.getSymptom();

        int doctorNumber = Doctor.getDoctorNumberWhoTreats(symptom);

        Doctor doctor = Doctor.callDoctor(doctorNumber);
        if (doctor == null) {
            System.out.println("we cannot treat this patient, there is no doctor");
            return;
        }

        Appointment appointment = new Appointment(patient, doctor, LocalDate.now());

        appointment.set();
        appointment.start();

        patient.isTreatedBy(doctor);
    }
}
