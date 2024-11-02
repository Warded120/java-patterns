package com.ivan.course.extrinsic;

import com.ivan.course.intrinsic.AppointmentType;
import com.ivan.course.intrinsic.Symptom;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Appointment {
    private int id;
    private String patientName;
    private Symptom symptom;
    private LocalDate date;
    AppointmentType appointmentType;

    public void hold() {
        appointmentType.start(this);
    }
}
