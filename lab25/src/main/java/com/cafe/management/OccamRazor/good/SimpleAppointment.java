package com.cafe.management.OccamRazor.good;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
class Appointment {
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(String patientName, String doctorName, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }
}
