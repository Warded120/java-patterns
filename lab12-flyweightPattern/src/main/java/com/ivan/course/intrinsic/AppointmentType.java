package com.ivan.course.intrinsic;

import com.ivan.course.extrinsic.Appointment;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AppointmentType {
    Doctor doctor;
    int cabinet;

    public void start(Appointment appointment) {
        String msg = "appointment is held in cabinet number: " + cabinet + " " + doctor.treat(appointment);
        System.out.println(msg);
    }
}
