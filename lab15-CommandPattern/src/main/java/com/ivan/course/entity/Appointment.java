package com.ivan.course.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Appointment {
    private String patientName;
    private String doctorName;
    private LocalDate appointmentTime;
    private boolean isHandled;

    public Appointment(String patientName, String doctorName, LocalDate appointmentTime) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentTime = appointmentTime;
    }

    public Appointment(Appointment appointment) {
        this.patientName = appointment.getPatientName();
        this.doctorName = appointment.getDoctorName();
        this.appointmentTime = appointment.getAppointmentTime();
        this.isHandled = appointment.isHandled();
    }
}
