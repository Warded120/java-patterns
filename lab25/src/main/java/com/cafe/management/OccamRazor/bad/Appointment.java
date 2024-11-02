package com.cafe.management.OccamRazor.bad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Appointment {
    private String patientName;
    private String doctorName;
    private String date;

    public Appointment(String patientName, String doctorName, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
