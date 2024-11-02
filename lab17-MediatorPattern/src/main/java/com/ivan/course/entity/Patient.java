package com.ivan.course.entity;

import com.ivan.course.mediator.Mediator;

public class Patient {
    private String name;
    private Mediator mediator;

    public Patient(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void scheduleAppointment(Doctor doctor) {
        mediator.scheduleAppointment(this, doctor);
    }

    public void receiveMessage(String message) {
        System.out.println("Patient " + name + " received message: " + message);
    }
}
