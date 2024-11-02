package com.ivan.course.appointment;

import lombok.Getter;

@Getter
public class AppointmentBuilder {
    //required params
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    //optional
    private String address;
    private boolean isOnline;
    private boolean isDeepDiagnostics;

    public AppointmentBuilder(String patientName, String doctorName, String appointmentDate) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    public AppointmentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public AppointmentBuilder setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }

    public AppointmentBuilder setIsDeepDiagnostics(boolean isDeepDiagnostics) {
        this.isDeepDiagnostics = isDeepDiagnostics;
        return this;
    }

    public Appointment build() {
        return new Appointment(this);
    }
}
