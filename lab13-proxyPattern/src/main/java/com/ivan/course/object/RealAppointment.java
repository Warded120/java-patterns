package com.ivan.course.object;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class RealAppointment implements Appointment {
    private final String patientName;
    private LocalDate date;

    @Override
    public void schedule(LocalDate date) {
        this.date = date;
    }

    public void notifyPatient() {
        System.out.println(patientName + " has been notified about the appointment");
    }


    public void start() {
        System.out.println("Appointment started on: " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Appointment has been cancelled");
    }

}
