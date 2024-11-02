package com.ivan.course.entity.person;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper=true)
public class Patient extends Person {

    private double temperature;

    public Patient(String name, int age, double temperature) {
        super(name, age);
        this.temperature = temperature;
    }
}
