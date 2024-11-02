package main.factories.Impl.appointment;

import main.factories.interfaces.AppointmentFactory;
import main.products.impl.appointment.AdultAppointment;
import main.products.interfaces.Appointment;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class AdultAppointmentFactory implements AppointmentFactory {
    @Override
    public Appointment createAppointment(Patient patient, Doctor doctor) {

        return new AdultAppointment(patient, doctor);
    }
}
