package com.ivan.course.component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Appointment /*can also implement some general Appointment interface*/{
    @Setter
    private String patientName;
    @Setter
    private LocalDateTime appointmentDateTime;
    @Setter
    private List<String> requiredExaminations;
    private boolean isAppointmentHeld;
    private String result;

    public Appointment(String patientName, LocalDateTime appointmentDateTime, List<String> requiredExaminations) {
        this.patientName = patientName;
        this.appointmentDateTime = appointmentDateTime;
        this.requiredExaminations = requiredExaminations;
    }

    public String holdAppointment() {
        if(isAppointmentHeld)
            return result;

        isAppointmentHeld = true;

        result = patientName + " had theese examinations: " + String.join(", ", requiredExaminations + "\nAppointment time: " + appointmentDateTime);
        return result;
    }
}
