package com.ivan.course.memento;

public class AppointmentMemento {
    private String patientName;
    private String doctorName;
    private String appointmentDate;

    public AppointmentMemento(String patientName, String doctorName, String appointmentDate) {
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
