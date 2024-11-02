package com.ivan.course.components;

import com.ivan.course.components.enums.Symptom;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Doctor {
    private String name;
    private Symptom treats;
    private int phoneNumber;

    public Doctor(String name, Symptom treats, int phoneNumber) {
        this.name = name;
        this.treats = treats;
        this.phoneNumber = phoneNumber;

        doctors.add(this);
    }

    private static List<Doctor> doctors = new ArrayList<Doctor>();

    public static Doctor callDoctor(int phoneNumber) {
        System.out.println("calling doctor: " + phoneNumber);
        for (Doctor doctor : doctors) {
            if (doctor.phoneNumber == phoneNumber) {
                return doctor;
            }
        }
        return null;
    }

    public static int getDoctorNumberWhoTreats(Symptom symptom) {
        System.out.println("looking for doctor who treats: " + symptom);
        for (Doctor doctor : doctors) {
            if (doctor.treats == symptom) {
                return doctor.phoneNumber;
            }
        }
        return 0;
    }
}
