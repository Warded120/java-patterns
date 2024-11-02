package com.cafe.management.APO.good;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Appointment {
    private String patientName;
    private String doctorName;
    private LocalDate appointmentDate;

    public void handle() {
        // Simple handling logic
        System.out.println("Handling appointment for " + patientName + " with " + doctorName + " on " + appointmentDate);
        // Assume some processing happens here
    }
}
