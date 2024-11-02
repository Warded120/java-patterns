package com.ivan.course;

import com.ivan.course.intrinsic.Symptom;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AppointmentManager manager = new AppointmentManager();
        for (int i = 0; i < 200; i++) {
            manager.addAppointment("patient" + i, Symptom.values()[i%5], LocalDate.now(), "doctor" + i%20, i%20, i%20);
        }

        manager.holdAppointments();
    }
}