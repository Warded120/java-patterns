package com.ivan.course.originator;

import com.ivan.course.memento.AppointmentMemento;

public class Appointment implements Originator {
    private String patientName;
    private String doctorName;
    private String appointmentDate;

    public Appointment(String patientName, String doctorName, String appointmentDate) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    @Override
    public AppointmentMemento save() {
        System.out.println("Saving appointment");
        return new AppointmentMemento(patientName, doctorName, appointmentDate);
    }

    @Override
    public void restore(AppointmentMemento memento) {
        System.out.println("restoring appointment from memento");
        patientName = memento.getPatientName();
        doctorName = memento.getDoctorName();
        appointmentDate = memento.getAppointmentDate();
    }

    @Override
    public String toString() {
        return "Appointment [patientName=" + patientName + ", doctorName=" + doctorName
                + ", appointmentDate=" + appointmentDate + "]";
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
