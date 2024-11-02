package com.cafe.management.KISS.bad;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Appointment {
    private String patientName;
    private LocalDate appointmentDate;

    public Appointment(char[] patientName, String appointmentDateInString) {

        this.patientName = "";

        for (char c : patientName) {
            this.patientName.concat(String.valueOf(c));
        }

        try{
            this.appointmentDate = LocalDate.parse(appointmentDateInString);
        } catch (DateTimeParseException e) {
            System.out.println("cannot parse appointment date: " + appointmentDateInString);
            this.appointmentDate = LocalDate.now();
        }
    }
}
