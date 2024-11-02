package com.ivan.course.intrinsic;

import com.ivan.course.extrinsic.Appointment;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    private String name;
    private Symptom treats;
    private int experience;

    public String treat(Appointment appointment) {
        if (treats != appointment.getSymptom()) {
            return ", but this doctor cannot treat this symptoms";
        }

        String msg = name + " treats " + appointment.getPatientName() + "'s " + treats.name();

        if (experience >= 15) {
            msg += " very efficiently";
        } else if (experience >= 10) {
            msg += " efficiently";
        } else if (experience >= 5) {
          // leave msg as it is
        } else if (experience >= 0) {
            msg += " with great effort";
        }
        return msg;
    }
}
