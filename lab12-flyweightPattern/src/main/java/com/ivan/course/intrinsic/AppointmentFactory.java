package com.ivan.course.intrinsic;

import java.util.HashMap;
import java.util.Map;

public class AppointmentFactory {
    private static Map<String, AppointmentType> appointmentTypes = new HashMap<>();

    public static AppointmentType getAppointmentType(String name, Symptom treats, int experience, int cabinet) {
        String key = name + treats + experience + cabinet;
        if (!appointmentTypes.containsKey(key)) {
            System.out.println("creating new appointment type");
            appointmentTypes.put(key, new AppointmentType(new Doctor(name, treats, experience), cabinet));
        }
        return appointmentTypes.get(key);
    }
}
