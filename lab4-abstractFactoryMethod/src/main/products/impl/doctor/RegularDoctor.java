package main.products.impl.doctor;

import main.products.abs.BaseDoctor;
import main.products.impl.patient.Adult;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class RegularDoctor extends BaseDoctor implements Doctor {

    public RegularDoctor(String name) {
        super(name);
    }

    public RegularDoctor() {}

    @Override
    public String examinePatient(Patient patient) {
        return patient.doWhatDoctorSays();
    }
}
