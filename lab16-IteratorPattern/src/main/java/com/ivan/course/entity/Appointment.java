package com.ivan.course.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Appointment {
    private String patientName;
    private String doctorName;
    private String appointmentTime;
}