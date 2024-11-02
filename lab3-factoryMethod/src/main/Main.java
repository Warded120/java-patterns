package main;

import main.creator.AppointmentCreator;
import main.creator.PatientCreator;
import main.entity.MyEntity;

public class Main {
    public static void main(String[] args) {
        AppointmentCreator appointmentCreator = new AppointmentCreator();
        PatientCreator patientCreator = new PatientCreator();

        MyEntity appointment = appointmentCreator.create();
        appointment.shit();

        var patient = patientCreator.create();
        patient.shit();
    }
}