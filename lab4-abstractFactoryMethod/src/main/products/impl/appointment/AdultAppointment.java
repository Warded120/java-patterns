package main.products.impl.appointment;

import main.products.abs.BaseAppointment;
import main.products.impl.doctor.RegularDoctor;
import main.products.impl.patient.Adult;
import main.products.interfaces.Appointment;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class AdultAppointment extends BaseAppointment implements Appointment {

    public AdultAppointment(Patient patient, Doctor doctor) {
        super(patient, doctor);
    }

    public AdultAppointment() {}

    @Override
    public String getAppointmentData() {
        return "Appointment:" +
                "\nPatient: " + patient.getName() + " and their temperature: " + patient.getTemperature() +
                "\nDoctor: " + doctor.getName();
    }

    @Override
    public String AnnounceDiagnose() {
        diagnose = patient.howDoIFeel();
        return diagnose;
    }
}
