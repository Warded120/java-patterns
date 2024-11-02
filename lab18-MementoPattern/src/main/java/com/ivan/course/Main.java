package com.ivan.course;

import com.ivan.course.caretaker.AppointmentCaretaker;
import com.ivan.course.originator.Appointment;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", "Dr. Smith", "Today");

        System.out.println("Appointment: " + appointment);

        AppointmentCaretaker caretaker = new AppointmentCaretaker();

        caretaker.saveState(appointment);

        appointment.setDoctorName("Dr. Dale");
        System.out.println("Modifying appointment: " + appointment);

        caretaker.restoreState(appointment);
        System.out.println("Appointment: " + appointment);
    }
}