package main.factories.interfaces;

import main.products.interfaces.Appointment;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public interface AppointmentFactory {
    Appointment createAppointment(Patient patient, Doctor doctor);
}
