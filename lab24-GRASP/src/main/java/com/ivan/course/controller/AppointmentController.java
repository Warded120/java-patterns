package com.ivan.course.controller;

import com.ivan.course.constants.Status;
import com.ivan.course.entity.appointment.Appointment;
import com.ivan.course.entity.appointment.DetailedAppointment;
import com.ivan.course.entity.appointment.FastAppointment;
import com.ivan.course.service.AppointmentService;

import java.time.LocalDate;
import java.util.Objects;

// Controller, information expert
public class AppointmentController {
    private static final AppointmentService service = new AppointmentService();;

    // Low coupling
    private final Appointment appointment;

    public AppointmentController(Status appointmentStatus, String patientName, int patientAge, double patientTemperature, String doctorName, int doctorAge, int doctorExperience, LocalDate appointmentDate) {
        if (Objects.requireNonNull(appointmentStatus) == Status.EMERGENCY) {
            appointment = new FastAppointment(
                    service.createPatient(patientName, patientAge, patientTemperature),
                    service.createDoctor(doctorName, doctorAge, doctorExperience),
                    appointmentDate
            );
        } else {
            appointment = new DetailedAppointment(
                    service.createPatient(patientName, patientAge, patientTemperature),
                    service.createDoctor(doctorName, doctorAge, doctorExperience),
                    appointmentDate
            );
        }
    }

    public void handleAppointment() {
        service.handleAppointment(appointment);
    }
}
