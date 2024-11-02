package com.ivan.course.decorator.concreteDecorator;

import com.ivan.course.component.Appointment;
import com.ivan.course.decorator.AppointmentDecorator;

import java.time.LocalDateTime;

public class EmergencyAppointmentDecorator extends AppointmentDecorator {
    public EmergencyAppointmentDecorator(Appointment appointment) {
        super(appointment);
    }

    public void setUpEmergencyAppointment() {
        System.out.println("Setting up emergency appointment");
        appointment.setAppointmentDateTime(LocalDateTime.now().plusHours(1)); // appointment is in one hour
    }
}
