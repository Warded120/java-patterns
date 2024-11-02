package com.ivan.course;

import com.ivan.course.components.Doctor;
import com.ivan.course.components.Patient;
import com.ivan.course.components.enums.Symptom;
import com.ivan.course.facade.AppointmentFacade;

public class Main {
    public static void main(String[] args) {
        new Doctor("Dr. Smith", Symptom.COUGH, 1234);
        new Doctor("Dr. Dales", Symptom.TEMPERATURE, 2353);
        new Doctor("Dr. Oleg", Symptom.SORE_THROAT, 9273);
        new Doctor("Dr. Buaaa", Symptom.POISONING, 1865);
        new Doctor("Dr. Ouch", Symptom.BROKEN_BONE, 1187);

        Patient patient = new Patient("Petya", 9999, Symptom.BROKEN_BONE);

        AppointmentFacade appointmentFacade = new AppointmentFacade(patient);
        appointmentFacade.setupAppointment();
    }
}