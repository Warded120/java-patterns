package com.ivan.course.appointment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Appointment {
    //required params
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    //optional
    private String address;
    private boolean isOnline;
    private boolean isDeepDiagnostics;

    public Appointment(AppointmentBuilder builder) {
        this.patientName = builder.getPatientName();
        this.doctorName = builder.getDoctorName();
        this.appointmentDate = builder.getAppointmentDate();
        this.address = builder.getAddress();
        this.isOnline = builder.isOnline();
        this.isDeepDiagnostics = builder.isDeepDiagnostics();
    }
}
