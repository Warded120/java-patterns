package com.ivan.course.entity;

import com.ivan.course.mediator.Mediator;

public class Doctor {
    private String name;
    private Mediator mediator;

    public Doctor(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String message) {
        System.out.println("Doctor " + name + " received message: " + message);
    }
}
