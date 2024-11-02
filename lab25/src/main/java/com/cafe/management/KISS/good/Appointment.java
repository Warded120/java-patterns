package com.cafe.management.KISS.good;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString
public class Appointment {
    private String patientName;
    private LocalDate appointmentDate;
}
