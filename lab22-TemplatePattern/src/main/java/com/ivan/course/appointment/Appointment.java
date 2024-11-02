package com.ivan.course.appointment;

public class Appointment {
    private String patientName;
    private String doctorName;
    private String appointmentDate;

    public Appointment(String patientName, String doctorName, String appointmentDate) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }
}
