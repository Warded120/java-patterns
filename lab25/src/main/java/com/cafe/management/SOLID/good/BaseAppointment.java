package com.cafe.management.SOLID.good;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

// LSP
@ToString
public class BaseAppointment {
    protected String patientName;
    protected LocalDate appointmentDate;

    public BaseAppointment(String patientName, LocalDate appointmentDate) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
    }
}
