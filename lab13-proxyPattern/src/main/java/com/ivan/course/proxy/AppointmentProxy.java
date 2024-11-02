package com.ivan.course.proxy;

import com.ivan.course.object.Appointment;
import com.ivan.course.object.RealAppointment;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class AppointmentProxy implements Appointment {
    RealAppointment appointment;
    private final String patientName;

    @Override
    public void schedule(LocalDate date) {
        init();
        appointment.schedule(date);
        appointment.notifyPatient();
        System.out.println("Appointment proxy scheduled appointment");
    }

    @Override
    public void start() {
        init();
        appointment.start();
        System.out.println("Appointment proxy started the appointment");
    }

    @Override
    public void cancel() {
        init();
        appointment.cancel();
        appointment.notifyPatient();
        System.out.println("Appointment proxy cancelled the appointment");
    }

    private Appointment init() {
        if (appointment == null) {
            System.out.println("Appointment proxy initializing appointment");
            appointment = new RealAppointment(patientName);
        }
        return appointment;
    }
}
