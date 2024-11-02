package com.cafe.management.APO.bad;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OptimizedAppointment {
    private String patientName;
    private String doctorName;
    private LocalDate appointmentDate;
    private static Map<String, String> appointmentCache = new HashMap<>();

    public OptimizedAppointment(String patientName, String doctorName, LocalDate appointmentDate) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    public void handle() {
        String key = patientName + doctorName + appointmentDate;
        if (appointmentCache.containsKey(key)) {
            System.out.println("Fetching appointment from cache: " + appointmentCache.get(key));
            return;
        }

        // Assume some complex handling logic here
        String result = "Handled appointment for " + patientName + " with " + doctorName + " on " + appointmentDate;
        appointmentCache.put(key, result);
        System.out.println(result);
    }
}
