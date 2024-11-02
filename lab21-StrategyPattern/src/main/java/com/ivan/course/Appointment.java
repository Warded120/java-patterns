package com.ivan.course;

public class Appointment {
    private final String patientName;
    private final String doctorName;
    private final String appointmentTime;

    public Appointment(String patientName, String doctorName, String appointmentTime) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", appointmentTime='" + appointmentTime + '\'' +
                '}';
    }
}
