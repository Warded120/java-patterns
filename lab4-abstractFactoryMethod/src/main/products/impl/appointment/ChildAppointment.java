package main.products.impl.appointment;

import main.products.abs.BaseAppointment;
import main.products.impl.doctor.Pediatrician;
import main.products.impl.patient.Child;
import main.products.interfaces.Appointment;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class ChildAppointment extends BaseAppointment implements Appointment {
    public ChildAppointment(Patient patient, Doctor doctor) {
        super(patient, doctor);
    }

    public ChildAppointment() {}

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
