package com.ivan.course.factory;

import com.ivan.course.entity.person.Doctor;

// Creator
public class DoctorFactory {
    public Doctor create(String name, int age, int experience) {
        return new Doctor(name, age, experience);
    }
}
