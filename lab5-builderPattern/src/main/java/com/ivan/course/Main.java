package com.ivan.course;

import com.ivan.course.appointment.Appointment;
import com.ivan.course.appointment.AppointmentBuilder;
import com.ivan.course.lazyAppointment.LazyAppointment;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new AppointmentBuilder("Oleg", "Dr. Smith", "now")
                .setAddress("here")
                .setIsOnline(false)
                .setIsDeepDiagnostics(true)
                .build();

        System.out.println(appointment);

        LazyAppointment lazyAppointment = LazyAppointment.builder()
                .setPatientName("another Oleg")
                .setDoctorName("another Dr. Smith")
                .build();

        System.out.println(lazyAppointment);

    }
}