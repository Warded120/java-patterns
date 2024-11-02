package com.ivan.course.components;

import com.ivan.course.components.enums.Symptom;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Patient {
    private String name;
    private Symptom symptom;

    public Patient(String name, int phoneNumber, Symptom symptom) {
        this.name = name;
        this.symptom = symptom;
    }

    public void isTreatedBy(Doctor doctor) {
        System.out.println(doctor.getName() + " treats " + name + " with " + symptom.toString());
    }
}
