package com.ivan.course.lazyAppointment;

import com.ivan.course.appointment.AppointmentBuilder;
import lombok.*;

@Builder(setterPrefix = "set")
@ToString
@AllArgsConstructor
public class LazyAppointment {
    //required params
    private final String patientName;
    private final String doctorName;
    private final String appointmentDate;
    //optional
    private String address;
    private boolean isOnline;
    private boolean isDeepDiagnostics;
}
