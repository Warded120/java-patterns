package com.ivan.course.factory;

import com.ivan.course.entity.person.Patient;

// Creator
public class PatientFactory {
    public Patient create(String name, int age, double temperature) {
        return new Patient(name, age, temperature);
    }
}
