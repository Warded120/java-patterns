package com.ivan.course.decorator;

import com.ivan.course.component.Appointment;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public abstract class AppointmentDecorator {
    protected Appointment appointment;

    public String holdAppointment() {
        return appointment.holdAppointment();
    }

    public String getPatientName() {
        return appointment.getPatientName();
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointment.getAppointmentDateTime();
    }

    public List<String> getRequiredExaminations() {
        return appointment.getRequiredExaminations();
    }

    public boolean isAppointmentHeld() {
        return appointment.isAppointmentHeld();
    }

    public String getResult() {
        return appointment.getResult();
    }
}